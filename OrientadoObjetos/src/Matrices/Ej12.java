package Matrices;

import java.util.Scanner;

public class Ej12 {
    public static void mostraMenu() {
        System.out.println("1. Registrar participante");
        System.out.println("2. Mostrar datos");
        System.out.println("3. Ver las puntuaciones");
        System.out.println("4. Salir");
    }

    public static void imprimirArray(String[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void imprimirMatriz(double[][] m) {
        for(int i=0; i<m.length; i++) {
            for (int j=0; j<m[i].length; j++) {
                System.out.print(m[i][j] +  " ");
            }
            System.out.println();
        }
    }

    public static void mostrarDatos(double[][] puntuaciones,
                                    String[] nombres) {
        int i=0;
        int[] anyos = {2023, 2024, 2025};
        while (i<puntuaciones.length && nombres[i]!=null) {
            System.out.println("Participante: " + nombres[i]);

            for (int j=0; j<3; j++) {
                System.out.println("\tLa marca del " + anyos[j] + " es: " +
                        puntuaciones[i][j]);
            }

            i++;
        }
    }

    public static void registrarParticipante(double[][] puntuaciones,
                                           String[] nombres, Scanner sc) {
        System.out.println("Nombre:");
        String nombre = sc.next();
        System.out.println("Puntuacion1");
        double p1 = sc.nextDouble();
        System.out.println("Puntuacion2");
        double p2 = sc.nextDouble();
        System.out.println("Puntuacion3");
        double p3 = sc.nextDouble();

        int pos = 0;
        while (nombres[pos]!=null && pos<nombres.length) {
            pos++;
        }
        nombres[pos] = nombre;
        puntuaciones[pos][0] = p1;
        puntuaciones[pos][1] = p2;
        puntuaciones[pos][2] = p3;
    }

    public static void verMejoresPuntuaciones(double[][] puntuaciones,
                                              String[] nombres) {
        int i=0;
        while (i<puntuaciones.length && nombres[i]!=null) {
            double max = Double.MIN_VALUE;

            for (int j=0; j<3; j++) {
               if (puntuaciones[i][j]>max) {
                   max = puntuaciones[i][j];
               }
            }
            System.out.println(nombres[i] + " - " +max);

            i++;
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        mostraMenu();
        int opcion = sc.nextInt();
        double[][] puntuaciones = new double[10][3];
        String[] nombres = new String[10];
        while (opcion!=4) {
            switch (opcion) {
                case 1:
                    registrarParticipante(puntuaciones, nombres, sc);
                    System.out.println("Caso 1");
                    imprimirArray(nombres);
                    imprimirMatriz(puntuaciones);
                    break;
                case 2:
                    mostrarDatos(puntuaciones, nombres);
                    break;
                case 3:
                    verMejoresPuntuaciones(puntuaciones, nombres);
                    break;
                default:
                    System.out.println("Opción no valida");
            }

            mostraMenu();
            opcion = sc.nextInt();
        }
        System.out.println("Adiós");

        sc.close();
    }
}
