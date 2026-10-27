package arrays_pdf2;

public class ArraysBorrador {
    public static int suma(int x, int y) {
        x=5;
        return x+y;
    }

    public static void prueba1 (int[] a) {
        a[0] = 3;
    }
    static void main() {
        int x1 = 15;

        System.out.println(suma(x1, 5));

        int [] a1 = {1, -6, 7};

        prueba1(a1);

        for (int i = 0; i<a1.length; i++) {
            System.out.println(a1[i]);
        }
    }
}
