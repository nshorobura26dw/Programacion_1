package arrays;

import java.util.Scanner;

public class Ej2 {
    static void main() {
        Scanner n = new Scanner(System.in);

        int [] array = new int[100];
        int suma = 0;
        double media = 0;

        for (int i = 0; i<array.length; i++) {
            array[i] = i+1;
            System.out.println(array[i]);
            suma += array[i];
        }

        media = (double) suma / (array.length);
        System.out.println("La suma de los elementos es " + suma + " y la media es " + media);
    }
}
