package arrays;

import java.util.Scanner;

public class Ej6 {
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el número de estudiantes: ");
        int num = n.nextInt();

        double [] notas = new double[num];
        double suma = 0;

        System.out.println("Inroduce las notas de los estudiantes: ");
        for (int i = 0; i<num; i++) {
            notas[i] = n.nextDouble();
            suma += notas[i];
        }
        double media = suma / (double) num;
        System.out.println("La media de las notas introducidas es " + media);

        double [] mayMed = new double[num];

        System.out.println("Estas son las notas mayores que la media: ");

        for (int i = 0; i<num; i++) {
            if (notas[i] > media) {
                System.out.println(notas[i]);
            }
        }
        n.close();
    }
}