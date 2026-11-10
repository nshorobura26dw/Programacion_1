package Matrices;

import java.util.Scanner;

public class Ej10V2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el número de filas: ");
        int filas = n.nextInt();

        System.out.println("Introduce el número de columnas: ");
        int columnas = n.nextInt();

        int[][] m = new int[filas][columnas];

        System.out.println("La matriz queda así: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Si es la primera o última fila, O la primera o última columna -> 1
                if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        n.close();
    }
}