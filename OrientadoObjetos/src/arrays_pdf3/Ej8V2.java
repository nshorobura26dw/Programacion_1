package arrays_pdf3;

import java.util.Scanner;

public class Ej8V2 {
    public static void mostrar(int [] array) {
        for (int i = 0; i<array.length-1; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println(array[array.length-1]);
    }
    public static void desplazar1Posicion(int [] array) {
        int aux = array[array.length-1];
        for (int i = array.length-1; i>0; i--) {
            array[i] = array[i-1];
        }
        array[0] = aux;
    }
    static void main() {
        Scanner n = new Scanner(System.in);

        System.out.println("Introduce la lognitud del array: ");
        int log = n.nextInt();

        System.out.println("¿Cuántas posiciones hacia atrás deben moverse los elementos?");
        int pos = n.nextInt();

        int [] array = new int[log];
        for (int i = 0; i<array.length; i++) {
            array[i] = (int) (Math.random()*20+1);
        }

        mostrar(array);

        int auxPos = pos % array.length;

        for (int i = 0; i<auxPos; i++) {
            desplazar1Posicion(array);
        }
        mostrar(array);
    }
}
