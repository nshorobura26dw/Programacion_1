public class Recorrido {
    private int idRecorrido;
    private String nombre;

    public Recorrido() {
    }

    public Recorrido(int idRecorrido, String nombre) {
        this.idRecorrido = idRecorrido;
        this.nombre = nombre;
    }

    public int getIdRecorrido() {
        return idRecorrido;
    }

    public void setIdRecorrido(int idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
