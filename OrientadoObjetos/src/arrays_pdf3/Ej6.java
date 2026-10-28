package arrays_pdf3;

import java.util.Scanner;

public class Ej6 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud del array: ");
        int log = n.nextInt();

        int [] a1 = new int[log];
        System.out.println("Introduce 9 números de un array de 10 elementos: ");
        for (int i = 0; i<a1.length-1; i++) {
            int num = n.nextInt();
            a1[i] = num;
        }
        System.out.println("Introduce el nuevo número a introducir: ");
        int n2 = n.nextInt();
        System.out.println("Introduce la posición en la que lo quieres introducir (0-9): ");
        int pos = n.nextInt();

        int [] a2 = new int[log];

        for (int i = 0; i<pos; i++) {
            a2[i] = a1[i];
        }
        a2[pos] = n2;
        for (int i = pos+1; i<a2.length; i++) {
            a2[i] = a1[i-1];
        }

        for (int i = 0; i<a2.length-1; i++) {
            System.out.print(a2[i] + " - ");
        }
        System.out.print(a2[a2.length - 1]);
    }
}