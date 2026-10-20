package Condicionales;

import java.util.Scanner;

public class Ej3 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int numero = n.nextInt();

        if (numero == 0) {
            System.out.println("El número introducido es 0.");
        } else if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
