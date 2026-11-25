package POO.Ej5;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public int cuadrante() {
        if (this.x > 0 && this.y > 0) {
            return 1;
        } else if (this.x < 0 && this.y > 0) {
            return 2;
        } else if (this.x < 0 && this.y < 0) {
            return 3;
        } else if (this.x > 0 && this.y < 0) {
            return 4;
        }
        return 0;
    }

    public void imprimirPunto() {
        int cuad = this.cuadrante();

        System.out.println("Coordenadas: (" + this.x + ", " + this.y + ")");
        if (cuad == 0) {
            System.out.println("El punto está sobre un eje o en el origen.");
        } else {
            System.out.println("Está en el cuadrante " + cuad);
        }
    }
}
