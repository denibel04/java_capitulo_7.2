/**
 * Capítulo 7 - Arrays bidimensionales
 * Ejercicio 3: Modifica el programa anterior de tal forma que los números que se introducen en el array se generen de forma aleatoria
 * (valores entre 100 y 999).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio03 {
    public static void main (String[] args) {
        int[][] num = new int[4][5];
        int sumaColumna = 0;
        int sumaFila = 0;
        int sumaTotal = 0;
        for (int i=0;i <4; i++) {
            for (int j = 0; j<5; j++) {
                num[i][j] = (int)(Math.random()*((999-100)+1)+100);
            }
        }
        for (int fila = 0; fila<6; fila++) {
            if (fila>0 && fila<5) {
                System.out.printf("%-5s %d", "Fila", fila-1);
            } else if (fila==5) {
                System.out.printf("%-7s", "Suma");
            } else {
                System.out.printf("%-7s", " ");
            }
            for (int columna = 0; columna<6; columna++) {
                // Imprime los nombres
                if (fila==0 && columna<5) {
                    System.out.printf("%10s %d", "Columna", columna);

                } else if (fila == 0 && columna==5) {
                    System.out.printf("%14s", "Suma");
                } else if (fila<5 && columna<5) {
                    System.out.printf("%12d", num[fila-1][columna]);
                }
                // Imprime los números
                if (fila>0 && fila<5 && columna<5) {
                    sumaFila += num[fila-1][columna];
                } else if (fila>0 && fila<5 && columna==5) {
                    System.out.printf("%9s %d", "∑:", sumaFila);
                }
            }
            sumaFila = 0;
            if (fila<5) {
                System.out.println();
            }
        }

        // Hace y muestra las sumas de las columnas y la total
        for (int columna = 0; columna<5; columna++) {
            for (int fila=0; fila<4; fila++) {
                sumaColumna += num[fila][columna];
            }
            System.out.printf("%7s %d", "∑:", sumaColumna);
            sumaTotal += sumaColumna;
            sumaColumna = 0;
        }
        System.out.printf("%9s %d", "Total:", sumaTotal);
    }
}
