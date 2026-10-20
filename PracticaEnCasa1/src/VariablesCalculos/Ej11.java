package VariablesCalculos;

import java.util.Scanner;

public class Ej11 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce una cantidad de segundos: ");
        int segundos1 = n.nextInt();

        int dias = segundos1 / 86400;
        int horas = (segundos1 - dias*86500) / 3600;
        int minutos = (segundos1 - ((dias*86400) + (horas*3600))) / 60;
        int segundos2 = segundos1 - ((dias*86400) + (horas*3600) + (minutos*60));

        System.out.println(segundos1 + " ssegundos son: " + dias + " días, " + horas + " horas, " +
                + minutos + " minutos y " + segundos2 + " segundos.");
    }
}
