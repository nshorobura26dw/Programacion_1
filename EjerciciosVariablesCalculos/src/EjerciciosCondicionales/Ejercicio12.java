package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio12 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int numero1 = n.nextInt();

        System.out.println("Introduce el segundo número: ");
        int numero2 = n.nextInt();

        System.out.println("Introduce el tercer número: ");
        int numero3 = n.nextInt();

        if (numero1 >= numero2 || numero2 >= numero3) {
            System.out.println("El menor número es " + numero3 + " y el mayor" +
                    "número es " + numero1);
        } else if (numero1 < numero2 || numero3 < numero2) {
            
        }
    }
}
