package arrays_pdf3;

import java.util.Scanner;

public class Ej8 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud del array: ");
        int log = n.nextInt();

        int [] a = new int[log];
        for (int i = 0; i<a.length; i++) {
            a[i] = (int) (Math.random()*20+1);
        }

        System.out.println("¿Cuántas posiciones hacia atrás deben moverse los elementos?");
        int pos = n.nextInt();

        int [] a2 = new int[log];
        for (int i = 0; i<=pos; i++) {
            a2[i] = a[a.length-pos];
            pos--;
        }
        for (int i = pos; i<a2.length-pos; i++) {
            a2[i] = a[i-pos];
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
