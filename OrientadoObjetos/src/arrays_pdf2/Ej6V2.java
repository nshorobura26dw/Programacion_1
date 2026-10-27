package arrays_pdf2;

import java.util.Scanner;

public class Ej6V2 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce el número de estudiantes: ");
        int num = n.nextInt();

        double [] notas = new double[num];
        double suma = 0;

        System.out.println("Inroduce las notas de los estudiantes: ");
        for (int i = 0; i < num; i++) {
            notas[i] = n.nextDouble();
            suma += notas[i];
        }
        double media = suma / (double) num;
        System.out.println("La media de las notas introducidas es " + media);
        
        int n2 = 0;
        for (int i = 0; i < num; i++) {
            if (notas[i] > media) {
                n2++;
            }
        }

        double [] mayMed = new double[n2];

        int pos = 0;
        for (int i = 0; i < num; i++) {
            if (notas[i] > media) {
                mayMed[pos] = notas[i];
                pos++;
            }
        }

        System.out.println("Estas son las notas mayores que la media: ");
        for (int i = 0; i < mayMed.length; i++) {
            System.out.println(mayMed[i]);
        }
        n.close();
    }
}