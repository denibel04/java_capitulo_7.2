/**
 * Capítulo 7 - Arrays bidimensionales
 * Ejercicio 4: Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la pantalla con un pequeño retardo, dando
 * la impresión de que el ordenador se queda “pensando” antes de mostrar los números.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio04 {
    public static void main (String[] args)
        throws InterruptedException {
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
                    Thread.sleep(1000);
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
            Thread.sleep(1000);
            sumaTotal += sumaColumna;
            sumaColumna = 0;
        }
        System.out.printf("%9s %d", "Total:", sumaTotal);
        Thread.sleep(1000);

        }

}
