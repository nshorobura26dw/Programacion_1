package Matrices;

import java.util.Scanner;

public class Ej11 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el tamaño de lado de la matriz: ");
        int lado = n.nextInt();

        int[][] m = new int[lado][lado];

        for (int i = 0; i<lado; i++) {
            for (int j = 0; j<lado; j++) {
                m[i][j] = (int) (Math.random() * 19 - 9);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Intercambio
        for (int i = 0; i<lado; i++) {
            for (int j = i + 1; j<lado; j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }

        //Poner los números del triángulo inferior a cero
        for (int i = 0; i<lado; i++) {
            for (int j = 0; j<i; j++) {
                m[i][j] = 0;
            }
        }

        for (int i = 0; i<lado; i++) {
            for (int j = 0; j<lado; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
