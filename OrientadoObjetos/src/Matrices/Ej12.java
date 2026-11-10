package Matrices;

import java.util.Scanner;

public class Ej12 {
    public static int registrar(String[] nombres, double[][] marcas, int num, Scanner n) {
        if (num >= nombres.length) {
            System.out.println("Error: No se pueden registrar más de 10 participantes.");
            return num;
        }

        System.out.println("Introduce el nombre de participante: ");
        nombres[num] = n.nextLine();

        System.out.println("Introduce la marca del participante 2020: ");
        marcas[num][0] = n.nextDouble();

        System.out.println("Introduce la marca del participante 2021: ");
        marcas[num][1] = n.nextDouble();

        System.out.println("Introduce la marca del participante 2022: ");
        marcas[num][2] = n.nextDouble();
        n.nextLine();

        System.out.println();
        return num + 1;
    }

    public static void mostrarDatos(String[] nombres, double[][] marcas, int num) {
        if (num == 0) {
            System.out.println("No hay participantes registrados.");
            return;
        }

        System.out.println("********* Todos los datos *********");
        System.out.println();
        for (int i = 0; i<num; i++) {
            System.out.println("Participante: " + nombres[i]);
            System.out.println("    la marca del 2020 es: " + marcas[i][0]);
            System.out.println("    la marca del 2021 es: " + marcas[i][1]);
            System.out.println("    la marca del 2022 es: " + marcas[i][2]);
            System.out.println();
        }
        System.out.println("***********************************");
    }

    public static void mejoresMarcas(String[] nombres, double[][] marcas, int num) {
        if (num == 0) {
            System.out.println("No hay participantes registrados.");
            return;
        }

        System.out.println("Cantidad " + num);
        System.out.println("********* Mejores marcas *********");

        String[] nombresAux = new String[num];
        double[] marcas2022Aux = new double[num];

        for (int i = 0; i < num; i++) {
            nombresAux[i] = nombres[i];
            marcas2022Aux[i] = marcas[i][2];
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1; j++) {
                if (marcas2022Aux[j] < marcas2022Aux[j + 1]) {
                    double tempMarca = marcas2022Aux[j];
                    marcas2022Aux[j] = marcas2022Aux[j + 1];
                    marcas2022Aux[j + 1] = tempMarca;

                    String tempNombre = nombresAux[j];
                    nombresAux[j] = nombresAux[j + 1];
                    nombresAux[j + 1] = tempNombre;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(nombresAux[i] + " - " + marcas2022Aux[i]);
        }
        System.out.println("***********************************");
    }

    public static boolean completar(int opcion) {
        if (opcion == 4) {
            System.out.println("El programa ha finalizado");
            return false;
        }
        return true;
    }

    static void main() {
        Scanner n = new Scanner(System.in);

        String[] participantes = new String[10];
        double[][] marcas = new double[10][3];

        int numParticipantes = 0;
        boolean continuar = true;

        while(continuar) {
            System.out.println("Elige una opción: \n1. Registrar un participante " +
                    "\n2. Mostrar datos \n3. Mostrar mejores marcas" +
                    "\n4. Finalizar programa");
            int opcion = n.nextInt();
            n.nextLine();

            switch (opcion) {
                case 1:
                    numParticipantes = registrar(participantes, marcas, numParticipantes, n);
                    break;
                case 2:
                    mostrarDatos(participantes, marcas, numParticipantes);
                    break;
                case 3:
                    mejoresMarcas(participantes, marcas, numParticipantes);
                    break;
                case 4:
                    continuar = completar(opcion);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        }
        n.close();
    }
}
