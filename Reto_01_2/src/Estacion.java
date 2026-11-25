public class Estacion {
    private int idEstacion;
    private String nombre;

    public Estacion() {
    }

    public Estacion(int idEstacion, String nombre) {
        this.idEstacion = idEstacion;
        this.nombre = nombre;
    }

    public int getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(int idEstacion) {
        this.idEstacion = idEstacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
