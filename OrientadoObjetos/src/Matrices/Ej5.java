package Matrices;

import java.util.Scanner;

public class Ej5 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el número de filas: ");
        int filas = n.nextInt();

        System.out.println("Introduce el número de columnas: ");
        int columnas = n.nextInt();

        System.out.println("Matriz inicial: ");
        int[][] m1 = new int[filas][columnas];
        for (int i = 0; i<m1.length; i++) {
            for (int j = 0; j<m1[i].length; j++) {
                m1[i][j] = (int) (Math.random() * 9 +1);
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        int filas2 = columnas;
        int columnas2 = filas;
        int[][] transpuesta = new int[filas2][columnas2];
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                transpuesta[i][j] = m1[j][i];
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }

        n.close();
    }
}
