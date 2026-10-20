package VariablesCalculos;

import java.util.Scanner;

public class Ej7 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la temperatura en grados farenheit: ");
        double temp1 = n.nextDouble();

        double temp2 = (temp1 - 32.0) * 5 / 9;

        System.out.println("La temperatura en grados centigrados es " + temp2);
    }
}
