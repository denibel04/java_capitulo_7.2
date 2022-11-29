/**
 * Capítulo 7 - Arrays bidimensionales
 * Ejercicio 6: Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio06 {
    public static void main (String[] args) {
        int[][] array = new int[6][10];
        int min = 1000;
        int max = 0;
        int maxFila = 0;
        int maxColumna = 0;
        int minFila = 0;
        int minColumna = 0;
        boolean repetido;
        for (int fila = 0; fila<6; fila++) {
            for (int columna = 0; columna<10; columna++) {
                do {
                    array[fila][columna] = (int)(Math.random()*60);
                    // Comprueba si el número generado ya está en el array.
                    repetido = false;
                    for (int i = 0; i < 10 * fila + columna; i++) {
                        if (array[fila][columna] == array[i / 10][i % 10]) {
                            repetido = true;
                        }
                    }
                } while (repetido);
                if (array[fila][columna]>max) {
                    max = array[fila][columna];
                    maxFila = fila;
                    maxColumna = columna;
                } else if (array[fila][columna]<min) {
                    min = array[fila][columna];
                    minFila = fila;
                    minColumna = columna;
                }
            }
        }
        System.out.print("       ");
        for (int fila = 0; fila<7; fila++) {
            if (fila>0) {
                System.out.printf("%-4s %d", "Fila", fila);
            }
            for (int columna = 0; columna<10; columna++) {
                if (fila==0) {
                    System.out.printf("%10s %d", "Columna", columna+1);
                } else {
                    System.out.printf("%12d", array[fila-1][columna]);
                }
            }
            System.out.println();
        }
        System.out.printf("El mínimo se encuentra en las coordenadas (%d,%d), y el máximo en (%d, %d)", minFila+1, minColumna+1, maxFila+1, maxColumna+1);
    }
}
