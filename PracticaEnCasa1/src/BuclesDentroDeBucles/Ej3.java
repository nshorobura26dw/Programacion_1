package BuclesDentroDeBucles;

import java.util.Scanner;

public class Ej3 {
    static void main() {
        Scanner n = new Scanner(System.in);
        long num = 1;
        long suma = 0;
        long factorial = 1;
        int cNumMay100 = 0;
        int cNumMen10 = 0;
        long aux1 = 0;
        long aux2 = num;
        double media = 0;

        while (num!=0) {
            System.out.println("Introduce un número entero: ");
            num = n.nextInt();
            if (num!=0){
                long x = num;
                suma = 0;

                while (x>0) {
                    suma += (x % 10);
                    x /= 10;
                }
                System.out.println("Suma: " + suma);

                aux2 = num;

                factorial = 1;
                for (int i = 1; i<=aux2; i++) {
                    factorial = factorial * i;
                    System.out.println(factorial);
                }

                if (suma > 100) {
                    cNumMay100++;
                }

                if (num < 10) {
                    cNumMen10++;
                    aux1 += num;
                }
            }
        }
        if (cNumMen10 > 0) {
            media = (double) (aux1 / cNumMen10);
        }

        System.out.println("La cantidad número de números cuya suma es mayor que 100: " + cNumMay100);
        System.out.println("La media de los números introducidos menores que 10: " + media);
    }
}