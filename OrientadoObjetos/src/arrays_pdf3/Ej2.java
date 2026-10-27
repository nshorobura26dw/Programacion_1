package arrays_pdf3;

import java.util.Scanner;

public class Ej2 {
    static void main() {
        Scanner n = new Scanner(System.in);

        int [] numeros = new int[10];

        System.out.println("Introduce 10 números enteros: ");
        for (int i = 0; i<numeros.length; i++) {
            int num = n.nextInt();
            numeros[i] = num;
        }

        int [] array2 = new int[10];

        int pos1 = 0;
        int pos2 = numeros.length -1;

        for (int i = 0; i<numeros.length; i++) {
            if (i == 0 || i % 2 == 0) {
                array2[pos1] = numeros[i];
                pos1++;
            } else {
                array2[pos1] = numeros[pos2];
                pos2--;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " - ");
        }
    }
}
