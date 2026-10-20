package VariablesCalculos;

import java.util.Scanner;

public class Ej8 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el radio del cilindro: ");
        int radio = n.nextInt();

        System.out.println("Introduce la altura del cilindro: ");
        int altura = n.nextInt();

        double pi = Math.PI;

        double radioDoble = Math.pow(radio, 2.0);

        double area = (double) 2.0 * pi * radio * (radio + altura);

        double volumen = (double) pi * radioDoble * altura;

        System.out.println("Área del cilindro: " + area);
        System.out.println("Volumen del cilindro: " + volumen);
    }
}
