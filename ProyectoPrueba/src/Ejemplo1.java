public class Ejemplo1 {
    static void main() {
        int x = 5;
        int y = 16;
        int z;

        z = x;
        x = y;
        y = z;

        System.out.println(x);
        System.out.println(y);
    }
}
