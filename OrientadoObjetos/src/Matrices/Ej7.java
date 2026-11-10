package Matrices;

public class Ej7 {
    static void main() {
        int filas = 7;
        int columnas = 7;
        int cont = columnas-1;

        int[][] m = new int[filas][columnas];
        for (int i = 0; i<filas; i++) {
            for (int j = columnas-1; j>0; j--) {
                if (j == cont) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
            }
            cont--;
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
