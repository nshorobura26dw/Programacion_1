package arrays_pdf3;

import java.util.Scanner;

public class Ej11 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud del array: ");
        int log = n.nextInt();

        int[] a = new int[log];
        System.out.println("Introduce los números del array: ");
        for (int i = 0; i<a.length; i++) {
            a[i] = n.nextInt();
        }

        System.out.println("Indica el índice del elemento a eliminar: ");
        int pos = n.nextInt();

        int [] a2 = new int[log-1];

        for (int i = 0; i<pos; i++) {
            a2[i] = a[i];
        }
        for (int i = pos; i<a2.length; i++) {
            a2[i] = a[i+1];
        }

        System.out.println("El array final es: ");
        for (int i = 0; i<a2.length-1; i++) {
            System.out.print(a2[i] + " - ");
        }
        System.out.println(a2[a2.length-1]);
    }
}