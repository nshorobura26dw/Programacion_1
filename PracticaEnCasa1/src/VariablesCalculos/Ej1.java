package VariablesCalculos;

import java.util.Scanner;

public class Ej1 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = n.nextLine();

        System.out.println("Introduce tu edad: ");
        int edad = n.nextInt();

        System.out.println("Hola, " + nombre + ", tienes " + edad + " años.");

        n.close();
    }
}
