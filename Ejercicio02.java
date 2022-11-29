/**
 * Capítulo 7 - Arrays bidimensionales
 * Ejercicio 2: Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas por 5 columnas. El programa
 * mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[4][5];
        int sumaColumna = 0;
        int sumaFila = 0;
        int sumaTotal = 0;
        System.out.println("Por favor, introduzca 20 números separados por INTRO: ");
        for (int i=0;i <4; i++) {
            for (int j = 0; j<5; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        sc.close();
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
                    System.out.printf("%10s", "Suma");
                } else if (fila<5 && columna<5) {
                    System.out.printf("%12d", num[fila-1][columna]);
                }
                // Imprime los números
                if (fila>0 && fila<5 && columna<5) {
                    sumaFila += num[fila-1][columna];
                } else if (fila>0 && fila<5 && columna==5) {
                    System.out.printf("%7s %d", "∑:", sumaFila);
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
            System.out.printf("%9s %d", "∑:", sumaColumna);
            sumaTotal += sumaColumna;
            sumaColumna = 0;
        }
        System.out.printf("%9s %d", "Total:", sumaTotal);

    }
}
