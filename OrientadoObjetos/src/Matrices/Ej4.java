package Matrices;

public class Ej4 {
    static void main() {
        System.out.println("Matriz inicial: ");
        int[][] m1 = new int[3][3];
        for (int i = 0; i<m1.length; i++) {
            for (int j = 0; j<m1[i].length; j++) {
                m1[i][j] = (int) (Math.random() * 9 +1);
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        int[][] transpuesta = new int[3][3];
        for (int i = 0; i< transpuesta.length; i++) {
            for (int j = 0; j<transpuesta[i].length; j++) {
                transpuesta[i][j] = m1[j][i];
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
