/**
 * Capítulo 7 - Arrays bidimensionales
 * Ejercicio 11: Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios entre 200 y 300. A
 * continuación, el programa debe mostrar los números de la diagonal que va desde la esquina superior izquierda a la esquina inferior derecha, así
 * como el máximo, el mínimo y la media de los números que hay en esa diagonal.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio11 {
    public static void main (String[] args) {
        int[][] array = new int[10][10];
        int max = 200;
        int min = 300;
        int suma = 0;
        for (int f=0; f<10; f++) {
            for (int c=0; c<10; c++) {
                array[f][c] = (int)((Math.random()*101)+200);
            }
        }

        // Muestra la diagonal
        System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        for (int f=0; f<10; f++) {
            for (int c=0; c<10; c++) {
                if (f==c) {
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
            if(f<9) {
                System.out.println("│\n├─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
            }
        }
        System.out.println("│\n└─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
        System.out.printf("mínimo: %d\nmáximo: %d\nmedia: %d", min, max, suma/10);
    }
}
