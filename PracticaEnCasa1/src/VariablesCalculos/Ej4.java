package VariablesCalculos;

import java.util.Scanner;

public class Ej4 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el número de niñas en clase: ");
        double ninas = n.nextDouble();

        System.out.println("Introduce el número de niños en clase: ");
        double ninos = n.nextDouble();

        double suma = ninas + ninos;

        double porcentajeNinas = (double) (ninas / suma) * 100.0;
        double porcentajeNinos = (double) (ninos / suma) * 100.0;

        System.out.println("El porcentaje de niñas es: " + porcentajeNinas + " y el porcentaje de niños es " + porcentajeNinos);

        n.close();
    }
}
