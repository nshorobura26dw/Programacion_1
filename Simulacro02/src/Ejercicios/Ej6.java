package Ejercicios;

import java.util.Scanner;

public class Ej6 {
    public static int[] crearYRellenarArray(int tam, Scanner sc) {
        int[] a = new int[tam];
        System.out.println("Introduce el número de elementos del array (números enteros):");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    // Subprograma obligatorio: Devuelve el número que falta o -1 si está completo
    public static int encontrarFaltante(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // Si el siguiente número no es exactamente el actual + 1, hay un hueco
            if (a[i + 1] != a[i] + 1) {
                return a[i] + 1;
            }
        }
        return -1; // Indica que no falta ningún número
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos elementos va a tener el array?");
        int tam = sc.nextInt();

        int[] array = crearYRellenarArray(tam, sc);

        int faltante = encontrarFaltante(array);

        if (faltante != -1) {
            System.out.println("El número que falta es: " + faltante);
        } else {
            System.out.println("No falta ningún número en el array");
        }

        sc.close();
    }
}
