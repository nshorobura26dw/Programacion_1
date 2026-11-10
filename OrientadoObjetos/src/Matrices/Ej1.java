package Matrices;

import java.util.Scanner;

public class Ej1 {
    static void main() {
        Scanner n = new Scanner(System.in);

        int[][] m = new int[5][5];
        int cont = 0;
        int num = 0;

        for (int i = 0; i<m.length; i++) {
            cont=i;
            for (int j = 0; j<m[i].length; j++) {
                num = cont;
                m[i][j] = num;
                System.out.print(m[i][j] + " ");
                cont++;
            }
            System.out.println();
        }

        n.close();
    }
}
