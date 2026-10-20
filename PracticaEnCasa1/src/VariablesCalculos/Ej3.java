package VariablesCalculos;

import java.util.Scanner;

public class Ej3 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra1 = n.nextLine();

        System.out.println("Introduce otra palabra: ");
        String palabra2 = n.nextLine();

        System.out.println("Introduce una última palabra: ");
        String palabra3 = n.nextLine();

        String frase = palabra1 + palabra2 + palabra3;

        int lognitud = frase.length();

        System.out.println("Tu frase es: " + frase + " y tiene una lognitud de " + lognitud + " caracteres.");

        n.close();
    }
}
