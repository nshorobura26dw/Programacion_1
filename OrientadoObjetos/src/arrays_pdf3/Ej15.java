package arrays_pdf3;

import java.util.Scanner;

public class Ej15 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud del array: ");
        int log = n.nextInt();

        int [] a = new int[log];

        System.out.println("Rellena el array con números enteros: ");
        for (int i = 0; i<a.length; i++) {
            a[i] = n.nextInt();
        }

        System.out.println("Este es el array inicial: ");
        for (int i = 0; i<a.length-1; i++) {
            System.out.print(a[i] + " - ");
        }
        System.out.print(a[a.length-1]);

        int suma = 0;

        int[] a2 = new int[log];
        for (int i = 0; i<a2.length; i++) {
            suma += a[i];
            a2[i] = suma;
        }

        System.out.println();
        System.out.println("Este es el array final: ");
        for (int i = 0; i<a2.length-1; i++) {
            System.out.print(a2[i] + " - ");
        }
        System.out.print(a2[a2.length-1]);
    }
}
