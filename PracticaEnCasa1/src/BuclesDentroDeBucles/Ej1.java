package BuclesDentroDeBucles;

import java.util.Scanner;

public class Ej1 {
    static void main() {
        Scanner n = new Scanner(System.in);

        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        double promedio = 0;



        //for(int i=0; i<=10;i++) {
        for(int i=0; i<=2; i++) {
            System.out.println("Código: ");
            int codigo = n.nextInt();

            //for(int j=1; j<=6; j++) {
            for(int j=1; j<=3; j++) {
                System.out.println("Calificación: ");
                int calificacion = n.nextInt();

                if (calificacion > maximo) {
                    maximo = calificacion;
                }

                if (calificacion < minimo) {
                    minimo = calificacion;
                }

                if (j==1) {
                    promedio += (calificacion / j);
                }
            }
        }

        System.out.println("Nota máxima: " + maximo + " ; nota mínima: " + minimo);
        System.out.println("Calificación promedio de la primera asignatura: " + promedio);
    }
}
