package VariablesCalculos;

import java.util.Scanner;

public class Ej10 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el número de personas: ");
        int personas = n.nextInt();

        int numeroApretones = (personas * (personas - 1)) / 2;

        System.out.println("En una reunión de " + personas + " personas se dan " + numeroApretones + " apretones de manos.");
    }
}
