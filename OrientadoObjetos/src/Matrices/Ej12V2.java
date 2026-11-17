package Matrices;

import java.util.Scanner;

public class Ej12V2 {
    public static void mostrarMenu() {
        System.out.println("Elige una opción: \n1. Registrar un participante " +
                "\n2. Mostrar datos \n3. Mostrar mejores marcas" +
                "\n4. Finalizar programa");
    }

    public static void imprimirArray(String[] array) {
        for (int i = 0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void imprimirMatriz(double[][] m) {
        for (int i = 0; i<m.length; i++) {
            for (int j = 0; j<m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void registrar(double[][] tiempos, String[] nombres, Scanner n) {
        System.out.println("Nombre: ");
        String nombre = n.nextLine();
        System.out.println("Puntuación 1: ");
        double p1 = n.nextDouble();
        System.out.println("Puntuación 2: ");
        double p2 = n.nextDouble();
        System.out.println("Puntuación 3: ");
        double p3 = n.nextDouble();

        String[] nNombres = new String[nombres.length+1];
        double[][] nPuntuaciones = new double[tiempos.length+1][3];

        for (int i = 0; i<tiempos.length; i++) {
            nNombres[i] = nombres[i];
            for (int j = 0; j<tiempos[i].length; j++) {
                nPuntuaciones[i][j] = tiempos[i][j];
            }
        }

        nNombres[nPuntuaciones.length-1] = nombre;
        nPuntuaciones[nPuntuaciones.length-1][0] = p1;
        nPuntuaciones[nPuntuaciones.length-1][1] = p1;
        nPuntuaciones[nPuntuaciones.length-1][2] = p1;

        nombres = nNombres;
        tiempos = nPuntuaciones;
    }

    public static void mostrarDatos(double[][] m, String[] nombres) {
        int i = 0;
        int[] anyos = {2023, 2024, 2025};
        while(i<m.length && nombres[i]!= null) {
            System.out.println("Participante: " + nombres[i]);
            for (int j = 0; j<3; j++) {
                System.out.println("La marca del " + anyos[i] + " es: " + m[i][j]);
            }
        }
    }

    public static void verMejoresPuntuaciones(double[][] m, String[] nombres) {
        int i = 0;
        while(i<m.length && nombres[i]!= null) {
            double max = Double.MIN_VALUE;
            for (int j = 0; j<3; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
            }
            System.out.println(nombres[i] + " - " + max);
        }
    }
    static void main() {
        Scanner n = new Scanner(System.in);
        mostrarMenu();
        int opcion = n.nextInt();
        double[][] tiempos = new double[0][0];
        String[] nombres = new String[10];
        while(opcion != 4) {
            switch (opcion) {
                case 1:
                    registrar(tiempos, nombres, n);
                    imprimirArray(nombres);
                    imprimirMatriz(tiempos);
                    break;
                case 2:
                    //mostrarDatos(tiempos, nombres);
                    break;
                case 3:
                    //verMejoresPuntuaciones(tiempos, nombres);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        System.out.println("Adiós.");

        n.close();
    }
}
