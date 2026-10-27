package arrays_pdf2;

import java.util.Scanner;

public class Ej3 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el número del DNI: ");
        long dni = n.nextInt();

        String [] array = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        for (int i = 0; i<22; i++) {
            if (dni % 23 == i) {
                System.out.println("El DNI del número introducido es: " + dni + array[i]);
            }
        }

        n.close();
    }
}