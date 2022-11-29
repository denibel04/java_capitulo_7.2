/**
 * Capítulo 7 - Arrays bidimensionales
 * Ejercicio 1: Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores según la siguiente tabla. Muestra el
 * contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio01 {
    public static void main (String[] args) {
        int[][] num = new int[3][6];
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 7;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        System.out.printf("%-10s", "Array num");
        for (int fila = 0; fila<4; fila++) {
            if (fila>0) {
                System.out.printf("%-5s %d", "Fila", fila-1);
            }
            for (int columna = 0; columna<6; columna++) {
                if (fila==0) {
                    System.out.printf("%10s %d", "Columna", columna);
                } else {
                    System.out.printf("%12d", num[fila-1][columna]);
                }
            }
            System.out.println();
        }
    }
}
