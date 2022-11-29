/**
 * Capítulo 7 - Arrays bidimensionales
 * Ejercicio 13: Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de diferentes países. El array que contiene los
 * nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular mediante un array de
 * 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 210. Los decimales de la media se pueden despreciar. Los nombres de los países
 * se deben mostrar utilizando el array de países (no se pueden escribir directamente).
 *
 * → @author Denisa Ramona Belean
 *   https://github.com/denibel04 ☆
 */
public class Ejercicio13 {
    public static void main (String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] altura = new int[4][10];
        for (int f=0; f<4; f++) {
            for (int c=0; c<10; c++) {
                altura[f][c] = (int)(((Math.random()*70)+140)+1);
            }
        }
        System.out.println("                                                               MED  MIN  MAX");
        for (int f=0; f<4; f++) {
            System.out.printf("%9s:", pais[f]);
            int suma = 0;
            int min = 210;
            int max = 140;
            for (int c=0; c<10; c++) {
                System.out.printf("%4d ", altura[f][c]);
                if (altura[f][c]>max) {
                    max = altura[f][c];
                } else if (altura[f][c]<min) {
                    min = altura[f][c];
                }
                suma += altura[f][c];
            }
            System.out.printf("| %4d %4d %4d", suma/10, min, max);
            System.out.println();
        }
    }
}
