package VariablesCalculos;

import java.util.Scanner;

public class Ej2 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int numero = n.nextInt();

        int doble = (int) Math.pow(numero, 2);

        int triple = (int) Math.pow(numero, 3);

        System.out.println("El doble del número " + numero + " es " + doble + " y el triple es " + triple);

        n.close();
    }
}
