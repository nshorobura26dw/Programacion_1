package arrays_pdf3;

import java.util.Scanner;

public class Ej3 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud de los primeros dos arrays: ");
        int n1 = n.nextInt();

        int n2 = n1*2;

        int [] array1 = new int[n1];
        int [] array2 = new int[n1];
        int [] array3 = new int[n2];

        System.out.println("Rellena el primer array con 10 números enteros: ");
        for (int i = 0; i<array1.length; i++) {
            int num = n.nextInt();
            array1[i] = num;
        }
        System.out.println("Rellena el segundo array con 10 números enteros: ");
        for (int i = 0; i<array2.length; i++) {
            int num2 = n.nextInt();
            array2[i] = num2;
        }

        int aux = 0;

        System.out.println("Resultado solicitado: ");
        for (int i = 0; i<array1.length; i++) {
            array3[aux] = array1[i];
            aux++;
            array3[aux] = array2[i];
            aux++;
        }

        for (int i = 0; i<array3.length-1; i++) {
            System.out.print(array3[i] + " - ");
        }
        System.out.print(array3[array3.length - 1]);
    }
}
