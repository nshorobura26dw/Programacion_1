package POO.Ej3;

public class Circulo {
    String color;
    double radio;

    public Circulo(String color, double radio) {
        this.color = color;
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(this.radio, 2.0);
    }

    public void imprimirPerimetro() {
        double perimetro = 2 * Math.PI * this.radio;
        System.out.println("El perimetro del círuclo: " + perimetro);
    }

    public boolean esGrande() {
        if (this.area() >= 20) {
            return true;
        }
        return false;
    }

    public boolean esIgual (Circulo c) {
        if (this.color.equals(c.color) && this.radio == c.radio) {
            return true;
        }
        return false;
    }

    public void mostrar() {
        System.out.println(this.color + " " + this.radio);
    }
}
