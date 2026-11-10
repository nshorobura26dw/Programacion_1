package Matrices;

import java.util.Scanner;

public class Ej10 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el número de filas: ");
        int filas = n.nextInt();

        System.out.println("Introduce el número de columnas: ");
        int columnas = n.nextInt();

        int[][] m = new int[filas][columnas];

        System.out.println("La matriz queda así: ");
        for (int i = 0; i<1; i++) {
            for (int j = 0; j<columnas; j++) {
                m[i][j] = 1;
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 1; i<filas-1; i++) {
            for (int j = 0; j<columnas; j++) {
                if (j == 0 || j == columnas-1) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = filas-1; i<filas; i++) {
            for (int j = 0; j<columnas; j++) {
                m[i][j] = 1;
                System.out.print(m[i][j] + " ");
            }
        }

        n.close();
    }
}
