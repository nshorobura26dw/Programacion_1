package Ejercicios;

import java.util.Scanner;

public class Ej5 {
    public static int[] crearYRellenarArray(int tam, Scanner sc, String orden) {
        int[] a = new int[tam];
        System.out.println("Introduce los elementos del " + orden + " array (números enteros):");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void imprimirArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " - ");
        }
        System.out.println(a[a.length - 1]);
    }

    // Subprograma obligatorio: Comprueba si a2 está contenido en orden dentro de a1
    public static boolean esSubarray(int[] a1, int[] a2) {
        int j = 0; // Puntero para recorrer el segundo array

        for (int i = 0; i < a1.length && j < a2.length; i++) {
            if (a1[i] == a2[j]) {
                j++; // Encontramos el siguiente elemento en orden
            }
        }

        // Si j llegó al final de a2, es que encontró todos sus elementos en orden
        return j == a2.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos elementos tendrá el primer array?");
        int tam1 = sc.nextInt();
        int[] a1 = crearYRellenarArray(tam1, sc, "primer");

        System.out.println("¿Cuántos elementos tendrá el segundo array?");
        int tam2 = sc.nextInt();
        int[] a2 = crearYRellenarArray(tam2, sc, "segundo");

        System.out.println("Primer array:");
        imprimirArray(a1);
        System.out.println("Segundo array:");
        imprimirArray(a2);

        if (esSubarray(a1, a2)) {
            System.out.println("El segundo array es un subarray del primero.");
        } else {
            System.out.println("El segundo array no es un subarray del primero.");
        }

        sc.close();
    }
}
