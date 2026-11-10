package arrays_pdf3;

import java.util.Scanner;

public class Ej13 {
    public static boolean esAscendente(int[] array) {
        for (int i = 0; i<array.length-1;  i++) {
            if (array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean esDescendente(int[] array) {
        for (int i = 0; i<array.length-1;  i++) {
            if (array[i] < array[i+1]) {
                return false;
            }
        }
        return true;
    }

    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud del array: ");
        int log = n.nextInt();

        int [] a1 = new int[log];
        System.out.println("Rellena el array con 10 números enteros: ");
        for (int i = 0; i<a1.length; i++) {
            int num = n.nextInt();
            a1[i] = num;
        }

        if (esAscendente(a1)) {
            if (a1[0] == a1[a1.length - 1]) {
                System.out.println("Todos los valores son iguales.");
            } else {
                System.out.println("El array es ascendente.");
            }
        } else if (esDescendente(a1)) {
            System.out.println("El array es descendente.");
        } else {
            System.out.println("El array no está ordenado.");
        }

        int [] a2 = new int[log];
        System.out.println("Rellena el array con 10 números enteros: ");
        for (int i = 0; i<a2.length; i++) {
            int num = n.nextInt();
            a2[i] = num;
        }

        if (esAscendente(a2)) {
            if (a2[0] == a2[a2.length - 1]) {
                System.out.println("Todos los valores son iguales.");
            } else {
                System.out.println("El array es ascendente.");
            }
        } else if (esDescendente(a2)) {
            System.out.println("El array es descendente.");
        } else {
            System.out.println("El array no está ordenado.");
        }

        int[] a3 = new int[log*2];
        int ai = 0;
        int aj = 0;
        int ak = 0;

        while (ai < a1.length && aj < a2.length) {
            if (a1[ai] <= a2[aj]) {
                a3[ak] = a1[ai];
                ai++;
            } else {
                a3[ak] = a2[aj];
                aj++;
            }
            ak++;
        }

        while (ai < a1.length) {
            a3[ak] = a1[ai];
            ai++;
            ak++;
        }

        while (aj < a2.length) {
            a3[ak] = a2[aj];
            aj++;
            ak++;
        }

        System.out.println("El array final es: ");
        for (int i = 0; i < a3.length - 1; i++) {
            System.out.print(a3[i] + " - ");
        }
        System.out.println(a3[a3.length - 1]);

        n.close();
    }
}