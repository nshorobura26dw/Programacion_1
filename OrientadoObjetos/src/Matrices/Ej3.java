package Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ej3 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Primera matriz: ");
        int[][] m1 = new int[3][3];
        for (int i = 0; i<m1.length; i++) {
            for (int j = 0; j<m1[i].length; j++) {
                m1[i][j] = (int) (Math.random() * 9 +1);
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Segunda matriz: ");
        int[][] m2 = new int[3][3];
        for (int i = 0; i<m2.length; i++) {
            for (int j = 0; j<m2[i].length; j++) {
                m2[i][j] = (int) (Math.random() * 9 +1);
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma de las matrices: ");
        int[][] m3 = new int[3][3];
        for (int i = 0; i<m3.length; i++) {
            for (int j = 0; j<m3[i].length; j++) {
                m3[i][j] = 0;
                m3[i][j] = m1[i][j] + m2[i][j];
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
