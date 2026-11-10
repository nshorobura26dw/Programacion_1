package Matrices;

public class Ej7V2 {
    static void main() {
        int filas = 7;
        int columnas = 7;
        int cont = columnas-1;

        int[][] m = new int[filas][columnas];
        for (int i = 0; i<filas; i++) {
            m[i][m.length -1 -i] = 1;
        }

        m[filas-1][0] = 1;

        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
