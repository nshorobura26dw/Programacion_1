package VariablesCalculos;

import java.util.Scanner;

public class Ej6 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la primera nota: ");
        int num1 = n.nextInt();

        System.out.println("Introduce la segunda nota: ");
        int num2 = n.nextInt();

        System.out.println("Introduce la tercera nota: ");
        int num3 = n.nextInt();

        double notaFinal = (double) (num1 * 0.3) + (num2 * 0.2) + (num3 * 0.5);

        System.out.println("La media de las tres notas es: " + notaFinal);
    }
}
