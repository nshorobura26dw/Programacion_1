package POO.Ej4;

import java.util.Scanner;

public class Biblioteca {
    public static boolean esPar(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
    public static int cantidadDig(int num) {
        int dig = 0;
        if (num == 0) {
            return 1;
        } else {
            int aux = Math.abs(num);

            while(aux > 0) {
                aux /= 10;
                dig++;
            }
        }
        return dig;
    }

    public static boolean tiene5Digitos(int num) {
        if (cantidadDig(num) > 5) {
            return true;
        }
        return false;
    }

    public static void esMultiplo10(Scanner sc) {
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();

        if (num % 10 == 0) {
            System.out.println("Es múltiplo de diez.");
        } else {
            System.out.println("No es múltiplo de diez.");
        }
    }
}
