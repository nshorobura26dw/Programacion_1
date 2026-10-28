package arrays_pdf3;

import java.util.Scanner;

public class Ej2 {
    static void main() {
        Scanner n = new Scanner(System.in);

        int [] numeros = new int[10];

        System.out.println("Introduce 10 números enteros: ");
        for (int i = 0; i<numeros.length; i++) {
            int num = n.nextInt();
            numeros[i] = num;
        }

        //n = 10
        //0 - 9
        //1 - 8
        //2 - 7
        //3 - 6
        //10-1-i(0)
        //10-1-i(1)

        for (int i = 0; i < numeros.length/2; i++) {
            System.out.print(numeros[i]+" - ");
            if (i == ((numeros.length/2)-1)) {
                System.out.print(numeros[numeros.length - i - 1]);
            } else {
                System.out.print(numeros[numeros.length - i - 1] + " - ");
            }
        }
        n.close();
    }
}