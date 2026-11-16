package POO.Ej2;

public class Estadistica {
    int suma;
    int cont;

    public Estadistica() {
        this.suma = 0;
        this.cont = 0;
    }

    public void anydirNumero(int num) {
        this.suma += num;
        this.cont++;
    }

    public void mostrarNumero() {
        System.out.println("Hemos añadido: " + this.cont + "numeros");
    }

    public void mostrarEstadistica() {
        double media = this.suma;
        System.out.println("La media de los números es: " + (media/this.cont));
    }
}
