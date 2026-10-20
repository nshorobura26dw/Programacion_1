package VariablesCalculos;

import java.util.Scanner;

public class Ej12 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce una cantidad de dinero: ");
        double dinero = n.nextDouble();

        int b1 = (int) (dinero / 200.0);
        double r1 = dinero % 200.0;

        int b2 = (int) (r1 / 100.0);
        double r2 = r1 % 100.0;

        int b3 = (int) (r2 / 50.0);
        double r3 = r2 % 50.0;

        int b4 = (int) (r3 / 20.0);
        double r4 = r3 % 20.0;

        int b5 = (int) (r4 / 10.0);
        double r5 = r4 % 10.0;

        int b6 = (int) (r5 / 5.0);
        double r6 = r5 % 5.0;

        int b7 = (int) (r6 / 2.0);
        double r7 = r6 % 2.0;

        int b8 = (int) (r7 / 1.0);
        double r8 = r7 % 1.0;

        double r9 = r8 * 100.0;

        int b9 = (int) (r9 / 50.0);
        r9 = r9 % 50.0;

        int b10 = (int) (r9 / 20.0);
        double r10 = r9 % 20.0;

        int b11 = (int) (r10 / 10.0);
        double r11 = r10 % 10.0;

        int b12 = (int) (r11 / 5.0);
        double r12 = r11 % 5.0;

        int b13 = (int) (r12 / 2.0);
        double r13 = r12 % 2.0;

        int b14 = (int) (r13 / 1.0);
        double r14 = r13 % 1.0;

        System.out.println("Esta es la división del dinero: ");
        System.out.println(b1 + " billetes de 200 euros.");
        System.out.println(b2 + " billetes de 100 euros.");
        System.out.println(b3 + " billetes de 50 euros.");
        System.out.println(b4 + " billetes de 20 euros.");
        System.out.println(b5 + " billetes de 10 euros.");
        System.out.println(b6 + " billetes de 5 euros.");
        System.out.println(b7 + " monedas de 2 euros.");
        System.out.println(b8 + " monedas de 1 euro.");
        System.out.println(b9 + " monedas de 50 céntimos.");
        System.out.println(b10 + " monedas de 20 céntimos.");
        System.out.println(b11 + " monedas de 10 céntimos.");
        System.out.println(b12 + " monedas de 5 céntimos.");
        System.out.println(b13 + " monedas de 2 céntimos.");
        System.out.println(b14 + " monedas de 1 céntimo.");
    }
}
