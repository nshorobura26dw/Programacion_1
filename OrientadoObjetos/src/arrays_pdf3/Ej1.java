package arrays_pdf3;

import java.util.Scanner;

public class Ej1 {
    static void main() {
        Scanner n = new Scanner(System.in);

        int [] numeros = new int[10];

        System.out.println("Introduce 10 números enteros: ");
        for (int i = 0; i<numeros.length; i++) {
            int num = n.nextInt();
            numeros[i] = num;
        }

        int positivos = 0;
        int contPos = 0;
        int negativos = 0;
        int contNeg = 0;
        int ceros = 0;
        double mediaPos = 0;
        double mediaNeg = 0;

        for (int i = 0; i<numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos += numeros[i];
                contPos++;
            }
            if (numeros[i] < 0) {
                negativos += numeros[i];
                contNeg++;
            }
            if (numeros[i] == 0) {
                ceros++;
            }
        }
        mediaPos = (double) positivos / (double) contPos;
        mediaNeg = (double) negativos / (double) contNeg;

        System.out.println("La media de los números positivos es: " + mediaPos);
        System.out.println("La media de los números negativos es: " + mediaNeg);
        System.out.println("Cantidad de números zero: " + ceros);
    }
}
