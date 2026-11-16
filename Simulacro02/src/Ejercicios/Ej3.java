package Ejercicios;

import java.util.Scanner;

public class Ej3 {
    public static int[][] crearYRellenarMatriz(int filas, int columnas) {
        int[][] m = new int[filas][columnas];
        for (int i = 0; i<m.length; i++) {
            for (int j = 0; i<m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 20) + 1;
            }
        }
        return m;
    }
    public static void imprimir(int[][] m) {
        for (int i = 0; i<m.length; i++) {
            for (int j = 0; j<m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void rotar(int[][] m) {
        
    }
    static void main() {
        Scanner n = new Scanner(System.in);


    }
}
