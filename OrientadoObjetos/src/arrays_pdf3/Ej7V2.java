package arrays_pdf3;

import java.util.Scanner;

public class Ej7V2 {
    public static void mostrar(int [] array) {
        for (int i = 0; i<array.length-1; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println(array[array.length-1]);
    }
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud del array: ");
        int log = n.nextInt();

        int [] array = new int[log];
        for (int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random()*20+1);
        }
        mostrar(array);
        System.out.println();

        int aux = array[array.length-1];
        for (int i = array.length-1; i>0; i--) {
            array[i] = array[i-1];
        }
        array[0] = aux;

        mostrar(array);
    }
}
