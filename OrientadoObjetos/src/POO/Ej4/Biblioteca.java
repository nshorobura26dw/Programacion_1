package POO.Ej4;

public class Biblioteca {
    public static boolean esPar(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
    public static int cantidadDig(int num) {
        int dig = 0;
        if (num == 0) {
            return 1;
        } else {
            int aux = Math.abs(num);

            while(aux > 0) {
                aux /= 10;
                dig++;
            }
        }
        return dig;
    }

}
