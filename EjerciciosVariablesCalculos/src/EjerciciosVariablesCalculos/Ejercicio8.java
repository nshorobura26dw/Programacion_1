package EjerciciosVariablesCalculos;

import java.util.Scanner;

public class Ejercicio8 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el radio del cilindro: ");
        int r = n.nextInt();

        System.out.println("Introduce la altura del cilindro: ");
        int h = n.nextInt();

        double pi = Math.PI;

        double A = (double) (2.0 * pi * r * (h + r));

        System.out.println("Área del cilindro: " + A);

        double y = Math.pow(r, 2.0);

        double V = (double) (pi * y * h);

        System.out.println("Volumen del cilindro: " + V);

    }
}
