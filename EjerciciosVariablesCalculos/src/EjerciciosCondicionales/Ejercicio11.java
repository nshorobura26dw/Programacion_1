package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio11 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el número de productos: ");
        int productos = n.nextInt();

        System.out.println("Introduce el precio de los productos: ");
        double precio = n.nextDouble();

        double descuento;

        if (productos < 0) {
            System.out.println("El número de productos no puede ser negativo.");
        } else if (precio < 0) {
            System.out.println("El precio de los productos no puede ser negativo.");
        } else if (productos >= 10) {
            double probabilidad = Math.random();

            if (probabilidad <= 0.75) {
                descuento = 0.1;
                double pagar1 = productos * precio * (1 - descuento);
                System.out.println("Tienes un descuento de 10%. \nLa cantidad a pagar es: " + pagar1 +
                        "€.");
            } else {
                descuento = 0.2;
                double pagar2 = productos * precio * (1 - descuento);
                System.out.println("Tienes un descuento de 20%. \nLa cantidad a pagar es: " + pagar2 +
                        "€.");
            }
        } else {
            double pagar3 = productos * precio;
            System.out.println("No tienes descuentos. \nLa cantidad a pagar es: " + pagar3 +
                    "€.");
        }
    }
}
