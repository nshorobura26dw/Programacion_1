package arrays_pdf3;

import java.util.Scanner;

public class Ej12 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud del array: ");
        int log = n.nextInt();

        int[] a = new int[log];

        System.out.println("Introduce los números del array: ");
        for (int i = 0; i<a.length; i++) {
            a[i] = n.nextInt();
        }

        int[] a2 = new int[log];
        int pos = 0;

        for (int i = 0; i<a.length; i++) {
            if (a[i] == 0) {
                a2[pos] = a[i];
                pos++;
            }
        }

        for (int i = 0; i<a.length; i++) {
            if (a[i] != 0 && a[i] % 2 != 0) {
                a2[pos] = a[i];
                pos++;
            }
        }

        for (int i = 0; i<a.length; i++) {
            if (a[i] != 0 && a[i] % 2 == 0) {
                a2[pos] = a[i];
                pos++;
            }
        }

        System.out.println("El array final es: ");
        for (int i = 0; i<a2.length-1; i++) {
            System.out.print(a2[i] + " - ");
        }
        System.out.println(a2[a2.length-1]);

        n.close();
    }
}