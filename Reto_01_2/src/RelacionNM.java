public class RelacionNM {
    // Recorrido_has_estacion
    private int idRecorrido;
    private int idEstacion;
    private int ordenParada;
    private int tiempoSiguienteParadaMinutos;

    // Precios
    private int idPrecio;
    private int idEstacionOrigen;
    private int idEstacionDestino;
    private double precio;

    public RelacionNM() {
    }

    public RelacionNM(int idRecorrido, int idEstacion, int ordenParada, int tiempoSiguienteParadaMinutos) {
        this.idRecorrido = idRecorrido;
        this.idEstacion = idEstacion;
        this.ordenParada = ordenParada;
        this.tiempoSiguienteParadaMinutos = tiempoSiguienteParadaMinutos;
    }

    public int getIdRecorrido() {
        return idRecorrido;
    }

    public void setIdRecorrido(int idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public int getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(int idEstacion) {
        this.idEstacion = idEstacion;
    }

    public int getOrdenParada() {
        return ordenParada;
    }

    public void setOrdenParada(int ordenParada) {
        this.ordenParada = ordenParada;
    }

    public int getTiempoSiguienteParadaMinutos() {
        return tiempoSiguienteParadaMinutos;
    }

    public void setTiempoSiguienteParadaMinutos(int tiempoSiguienteParadaMinutos) {
        this.tiempoSiguienteParadaMinutos = tiempoSiguienteParadaMinutos;
    }

    public int getIdPrecio() {
        return idPrecio;
    }

    public void setIdPrecio(int idPrecio) {
        this.idPrecio = idPrecio;
    }

    public int getIdEstacionOrigen() {
        return idEstacionOrigen;
    }

    public void setIdEstacionOrigen(int idEstacionOrigen) {
        this.idEstacionOrigen = idEstacionOrigen;
    }

    public int getIdEstacionDestino() {
        return idEstacionDestino;
    }

    public void setIdEstacionDestino(int idEstacionDestino) {
        this.idEstacionDestino = idEstacionDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
