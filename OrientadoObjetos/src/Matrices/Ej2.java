package Matrices;

import java.util.Scanner;

public class Ej2 {
    public static boolean esSimetrica(int[][] m) {
        int filas = m.length;
        int columnas = m[0].length;

        if (filas != columnas) {
            return false;
        }

        for (int i = 0; i<filas; i++) {
            for (int j = i+1; j<columnas; j++) {
                if (m[i][j] != m[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
    static void main() {
        Scanner n = new Scanner(System.in);

        int[][] m = new int[4][4];

        System.out.println("Completa la matriz: ");
        for (int i = 0; i<m.length; i++) {
            for (int j = 0; j<m[i].length; j++) {
                int num = n.nextInt();
                m[i][j] = num;
            }
        }

        for (int i = 0; i<m.length; i++) {
            for (int j = 0; j<m[i].length; j++) {
                System.out.println(m[i][j]);
            }
        }

        if (!esSimetrica(m)) {
            System.out.println("La matriz no es simétrica.");
        } else {
            System.out.println("La matriz es simétrica.");
        }

        n.close();
    }
}
