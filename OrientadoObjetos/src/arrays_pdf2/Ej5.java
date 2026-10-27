package arrays_pdf2;

import java.util.Scanner;

public class Ej5 {
    static void main() {
        Scanner n = new Scanner(System.in);

        int mayor = Integer.MIN_VALUE;

        int [] a1 = new int[5];
        int [] a2 = new int[5];

        System.out.println("Introduce 5 números enteros: ");
        for (int i = 0; i<a1.length; i++) {
            int num = n.nextInt();
            a1[i] = num;
        }

        int n1 = a2.length;
        for (int i = 0; i<a2.length; i++) {
            a2[i] = a1[n1-1-i];
        }

        for (int i = 0; i<a2.length; i++) {
            System.out.print(a2[i] + " ");
        }
        System.out.println();

        n.close();
    }
}
