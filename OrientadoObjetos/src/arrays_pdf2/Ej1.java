package arrays_pdf2;

import java.util.Scanner;

public class Ej1 {
    static void main() {
        Scanner n = new Scanner(System.in);
        int [] array = new int [10];

        System.out.println("Introduce 10 números enteros: ");
        for (int i = 0; i<array.length; i++) {
            int num = n.nextInt();
            array[i] = num;
        }
        for (int i =0; i<array.length; i++) {
            System.out.println("En la posición " + i + " está el valor " + array[i]);
        }

        n.close();
    }
}