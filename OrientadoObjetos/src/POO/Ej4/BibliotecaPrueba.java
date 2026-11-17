package POO.Ej4;

import java.util.Scanner;

public class BibliotecaPrueba {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println(Biblioteca.cantidadDig(1234));

        System.out.println(Biblioteca.tiene5Digitos(1234455));
        System.out.println(Biblioteca.tiene5Digitos(1223));

        Biblioteca.esMultiplo10(sc);
        Biblioteca.esMultiplo10(sc);
    }
}
