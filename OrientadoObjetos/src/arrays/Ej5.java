package arrays;

import java.util.Scanner;

public class Ej5 {
    static void main() {
        Scanner n = new Scanner(System.in);

        int mayor = Integer.MIN_VALUE;

        int [] a1 = new int[5];
        int [] aF = new int[5];

        System.out.println("Introduce 5 números enteros: ");
        for (int i = 0; i<a1.length; i++) {
            int num = n.nextInt();
            a1[i] = num;
        }

        for (int i = 0; i<aF.length; i++) {
            for (int j = 0; j<aF.length; j++) {
                if (a1[j] > mayor) {
                    mayor = a1[i];
                }
            }
            aF[i] = a1[i];
            System.out.print(aF[i] + " ");
        }
    }
}
