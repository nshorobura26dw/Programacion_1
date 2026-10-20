package EjerciciosVariablesCalculos;

import java.util.Scanner;

public class Ejercicio9 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud del cateto: ");
        int c1 = n.nextInt();

        System.out.println("Introduce la lognitud del otro cateto: ");
        int c2 = n.nextInt();

        double e1 = (double) Math.pow(c1, 2.0);
        double e2 = (double) Math.pow(c2, 2.0);

        double h = Math.sqrt(e1 + e2);

        System.out.println("La hipotenusa tiene una lognitud de " + h + " en total.");
    }
}
