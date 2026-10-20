import java.util.Scanner;

public class EjercicioNumeros {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        double numero1 = n.nextDouble();

        System.out.println("Introduce un segundo número: ");
        double numero2 = n.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es más grande que el número " + numero2);
        } else if (numero1 < numero2) {
            System.out.println("El número " + numero2 + " es más grande que el número " + numero1);
        } else {
            System.out.println("Ambos números son iguales.");
        }

        System.out.println("Introduce otro número: ");
        double numero3 = n.nextDouble();

        if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El número " + numero3 + " es el más grande de los tres.");
        } else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println("El número " + numero3 + " es el más pequeño de los tres.");
        } else if (numero3 > numero1 && numero3 < numero2) {
            System.out.println("El número " + numero3 + " es más grande que el número " + numero1 + ", pero es más pequeño que el número " + numero2);
        } else if (numero3 < numero1 && numero3 > numero2) {
            System.out.println("El número " + numero3 + " es más pequeño que el número " + numero1 + ", pero es más grande que el número " + numero2);
        } else if (numero1 == numero2 && numero3 == numero1 && numero3 == numero2) {
            System.out.println("El número " + numero3 + " es igual que los otros dos números");
        }
    }
}
