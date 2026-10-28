package arrays_pdf3;

import java.util.Scanner;

public class Ej7 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud del array: ");
        int log = n.nextInt();

        int [] a = new int[log];
        int [] a2 = new int[log];
        for (int i = 0; i<a.length; i++) {
            a[i] = (int) (Math.random()*20+1);
        }

        a2[0] = a[a.length-1];
        for (int i = 1; i<=a.length-1; i++) {
            a2[i] = a[i-1];
        }

        for (int i = 0; i<a.length-1; i++) {
            System.out.print(a[i] + " - ");
        }
        System.out.print(a[a.length - 1]);

        System.out.println();

        for (int i = 0; i<a2.length-1; i++) {
            System.out.print(a2[i] + " - ");
        }
        System.out.print(a2[a2.length - 1]);
    }
}
