package Condicionales;

import java.util.Scanner;

public class Ej2 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el número de Gygabytes: ");
        double giga = n.nextDouble();

        int cd = 700;

        double mega = (double) (giga * 1024);
        double resto = (double) mega % cd;

        int cantidadDeCDs = (int) (mega / cd);

        if (resto > 0) {
            cantidadDeCDs = cantidadDeCDs + 1;
        }

        System.out.println("Para guardar " + giga + " GB se necesitan " + cantidadDeCDs + " CDs.");
    }
}
