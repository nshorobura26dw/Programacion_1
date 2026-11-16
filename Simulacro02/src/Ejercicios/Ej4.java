package Ejercicios;

import java.util.Scanner;

public class Ej4 {
    public static void imprimirArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " - ");
        }
        if (a.length > 0) {
            System.out.println(a[a.length - 1]);
        }
    }

    // Subprograma obligatorio: Devuelve un nuevo array sin el número indicado
    public static int[] borrarNumero(int[] a, int numBorrar) {
        // 1. Contamos cuántas veces aparece el número para saber el nuevo tamaño
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == numBorrar) {
                contador++;
            }
        }

        // 2. Creamos el nuevo array con el tamaño exacto
        int[] resultado = new int[a.length - contador];
        int pos = 0; // Puntero de escritura

        // 3. Copiamos solo los números distintos al que queremos borrar
        for (int i = 0; i < a.length; i++) {
            if (a[i] != numBorrar) {
                resultado[pos] = a[i];
                pos++;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array fijo de 20 elementos del enunciado
        int[] inicial = {3, 3, 5, 7, 7, 8, 2, 1, 5, 0, 4, 5, 0, 0, 3, 1, 6, 6, 2, 8};

        System.out.println("Array inicial:");
        imprimirArray(inicial);

        System.out.println("Introduce los números a borrar:");
        int num = sc.nextInt();

        int[] arrayFinal = borrarNumero(inicial, num);

        System.out.println("El array resultante será el siguiente:");
        imprimirArray(arrayFinal);

        sc.close();
    }
}
