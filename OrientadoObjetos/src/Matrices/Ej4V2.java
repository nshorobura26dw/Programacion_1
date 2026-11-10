package Matrices;

public class Ej4V2 {
    static void main() {
        System.out.println("Matriz inicial: ");
        int[][] m1 = new int[3][3];
        for (int i = 0; i<m1.length; i++) {
            for (int j = 0; j<m1[i].length; j++) {
                m1[i][j] = (int) (Math.random() * 10);
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i<m1.length; i++) {
            for (int j = i+1; j<m1[i].length; j++) {
                int aux = m1[i][j];
                m1[i][j] = m1[j][i];
                m1[j][i] = aux;
            }
        }

        for (int i = 0; i<m1.length; i++) {
            for (int j = 0; j<m1[i].length; j++) {
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
