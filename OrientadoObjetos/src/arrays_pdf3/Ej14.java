package arrays_pdf3;

import java.util.Scanner;

public class Ej14 {
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

        int i = 0;
        boolean encontrado = false;

        System.out.println("Introduce un número que esté en el array: ");
        int num = n.nextInt();

        while (i<a1.length && !encontrado) {
            if (num == a1[i]) {
                encontrado = true;
            } else {
                i++;
            }
        }

        if (encontrado) {
            System.out.println("La posición del número introducido es " + i);
        } else {
            System.out.println("El número introducido no está en el array.");
        }
    }
}
