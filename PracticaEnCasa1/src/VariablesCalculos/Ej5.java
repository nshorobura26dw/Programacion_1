package VariablesCalculos;

import java.util.Scanner;

public class Ej5 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Primer número entero: ");
        int numero1 = n.nextInt();

        System.out.println("Segundo número entero: ");
        int numero2 = n.nextInt();

        System.out.println("Tercer número entero: ");
        int numero3 = n.nextInt();

        double promedio = (double) (numero1 + numero2 + numero3) / 3.0;

        System.out.println("La media de los tres números es: " + promedio);
    }
}
