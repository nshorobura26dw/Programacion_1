package POO.Ej3;

public class CirculoPrueba {
    static void main() {
        Circulo c1 = new Circulo("Rojo", 3.4);
        Circulo c2 = new Circulo("Verde", 6.0);
        Circulo c3 = new Circulo("Rojo", 3.4);
        c1.mostrar();
        c2.mostrar();
        c3.mostrar();

        if (c1.esIgual(c2)) {
            System.out.println("Son iguales c1 y c2.");
        } else {
            System.out.println("Son distintos c1 y c2.");
        }

        if (c1.esIgual(c3)) {
            System.out.println("Son iguales c1 y c3.");
        } else {
            System.out.println("Son distintos c1 y c3.");
        }

        if (c2.esIgual(c3)) {
            System.out.println("Son iguales c2 y c3.");
        } else {
            System.out.println("Son distintos c2 y c3.");
        }

        if (c1.esGrande()) {
            System.out.println("C1 es grande.");
        } else {
            System.out.println("C1 no es grande.");
        }

        if (c2.esGrande()) {
            System.out.println("C2 es grande.");
        } else {
            System.out.println("C2 no es grande.");
        }

        if (c3.esGrande()) {
            System.out.println("C3 es grande.");
        } else {
            System.out.println("C3 no es grande.");
        }

        System.out.println(c1.area());
        c1.imprimirPerimetro();
    }
}
