package arrays;

import java.util.Scanner;

public class Ej4 {
    static void main() {
        Scanner n = new Scanner(System.in);

        int num = 10;

        String [] nombres = new String[num];
        double [] notas = new double[num];

        System.out.println("Introduce los nombres de 10 alumnos: ");
        for (int i = 0; i<nombres.length; i++) {
            String nombre = n.nextLine();
            nombres[i] = nombre;
        }

        System.out.println("Introduce 10 notas (números decimales): ");
        for (int i = 0; i<notas.length; i++) {
            double nota = n.nextDouble();
            notas[i] = nota;
        }

        String [] letras = new String[num];

        for (int i = 0; i<letras.length; i++) {
            if (notas[i] >= 0 && notas[i] < 5) {
                letras[i] = "D";
            } else if (notas[i] < 7) {
                letras[i] = "C";
            } else if (notas[i] < 9) {
                letras[i] = "B";
            } else if (notas[i] <=10) {
                letras[i] = "A";
            }
        }

        for (int i = 0; i<nombres.length; i++) {
            System.out.println("Alumno: " + nombres[i] + " - Calificaciónn: " + letras[i]);
        }

        n.close();
    }
}
