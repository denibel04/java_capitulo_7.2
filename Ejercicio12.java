/**
 * Capítulo 7 - Arrays bidimensionales
 * Ejercicio 12: Realiza un programa que muestre por pantalla un array de 9 filas por 9 columnas relleno con números aleatorios entre 500 y 900. A continuación,
 * el programa debe mostrar los números de la diagonal que va desde la esquina inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 * y la media de los números que hay en esa diagonal.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio12 {
    public static void main (String[] args) {
        int[][] array = new int[9][9];
        int max = 500;
        int min = 900;
        int suma = 0;
        for (int f=0; f<9; f++) {
            for (int c=0; c<9; c++) {
                array[f][c] = (int)((Math.random()*401)+500);
            }
        }

        // Muestra la diagonal
        System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        for (int f=0; f<9; f++) {
            for (int c=0; c<9; c++) {
                if (f+c==8) {
                    System.out.printf("│%4d ", array[f][c]);
                    if (array[f][c]>max) {
                        max = array[f][c];
                    } else if (array[f][c]<min) {
                        min = array[f][c];
                    }
                    suma += array[f][c];
                } else {
                    System.out.printf("│%5s", " ");
                }
            }
            if(f<8) {
                System.out.println("│\n├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
            }
        }
        System.out.println("│\n└─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        System.out.printf("mínimo: %d\nmáximo: %d\nmedia: %d", min, max, suma/10);
    }
}
