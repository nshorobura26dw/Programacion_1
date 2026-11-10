package Matrices;

public class Ej8 {
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int i = 0; i<matriz.length; i++) {
            suma += matriz[fila][i];
        }
        return  suma;
    }

    /*public static void mostrarSuma(int[][] muestra) {
        for (int i = 0; i<muestra.length; i++) {
            System.out.println("La suma de la fila " + i + " es: " + sumaFila(muestra, i));
        }
    }*/
    static void main() {
        int[][] m = new int[10][10];

        System.out.println("Matriz inicial: ");
        for (int i = 0; i<m.length; i++) {
            for (int j = 0; j<m[i].length; j++) {
                m[i][j] = (int) (Math.random() * 21);
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i<m.length; i++) {
            System.out.println("La suma de la fila " + i + " es: " + sumaFila(m,i));
        }
    }
}