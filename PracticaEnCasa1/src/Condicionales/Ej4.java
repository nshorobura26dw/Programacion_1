package Condicionales;

import java.util.Scanner;

public class Ej4 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = n.nextLine();

        System.out.println("Introduce una palabra: ");
        String palabra = n.nextLine();

        if (frase.contains(palabra)) {
            System.out.println("En la frase está la palabra indicada.");
        } else {
            System.out.println("En la frase NO está la palabra indicada.");
        }
    }
}
