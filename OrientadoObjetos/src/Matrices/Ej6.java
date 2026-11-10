package Matrices;

public class Ej6 {
    static void main() {
        int filas = 7;
        int columnas = 7;
        int cont = 0;

        int[][] m = new int[filas][columnas];
        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                if (j == cont) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
            }
            cont++;
        }

        for (int i = 0; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
