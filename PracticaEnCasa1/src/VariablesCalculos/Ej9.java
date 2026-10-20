package VariablesCalculos;

import java.util.Scanner;

public class Ej9 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud del cateto: ");
        int cateto1 = n.nextInt();

        System.out.println("Introduce la lognitud del otro cateto: ");
        int cateto2 = n.nextInt();

        double doble1 = (double) Math.pow(cateto1, 2.0);
        double doble2 = (double) Math.pow(cateto2, 2.0);

        double sumaCatetos = doble1 + doble2;

        double hipotenusa = (double) Math.sqrt(sumaCatetos);

        System.out.println("La hipotenusa tiene una lognitud de " + hipotenusa + " en total.");
    }
}
