public class Reserva {
    private int idReserva;
    private String codigoReserva;
    private String horaReserva;
    private String horaViaje;
    private int idPasajero;
    private int idTren;
    private int idEstacionLlegada;
    private int idEstacionSalida;
    private boolean realizado;
    private int[] idsAsientosReservados;
    private int numAsientosReservados;

    public Reserva() {
        this.idsAsientosReservados = new int[50];
        this.numAsientosReservados = 0;
        this.realizado = false;
    }

    public Reserva(int idReserva, String codigoReserva, String horaReserva, String horaViaje,
                   int idPasajero, int idTren, int idEstacionLlegada, int idEstacionSalida,
                   boolean realizado) {
        this();
        this.idReserva = idReserva;
        this.codigoReserva = codigoReserva;
        this.horaReserva = horaReserva;
        this.horaViaje = horaViaje;
        this.idPasajero = idPasajero;
        this.idTren = idTren;
        this.idEstacionLlegada = idEstacionLlegada;
        this.idEstacionSalida = idEstacionSalida;
        this.realizado = realizado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    public String getHoraViaje() {
        return horaViaje;
    }

    public void setHoraViaje(String horaViaje) {
        this.horaViaje = horaViaje;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public int getIdTren() {
        return idTren;
    }

    public void setIdTren(int idTren) {
        this.idTren = idTren;
    }

    public int getIdEstacionLlegada() {
        return idEstacionLlegada;
    }

    public void setIdEstacionLlegada(int idEstacionLlegada) {
        this.idEstacionLlegada = idEstacionLlegada;
    }

    public int getIdEstacionSalida() {
        return idEstacionSalida;
    }

    public void setIdEstacionSalida(int idEstacionSalida) {
        this.idEstacionSalida = idEstacionSalida;
    }

    public boolean isRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

    public int[] getIdsAsientosReservados() {
        return idsAsientosReservados;
    }

    public int getNumAsientosReservados() {
        return numAsientosReservados;
    }

    public void agregarAsientoReservado(int idAsiento) {
        if (numAsientosReservados < idsAsientosReservados.length) {
            idsAsientosReservados[numAsientosReservados] = idAsiento;
            numAsientosReservados++;
        }
    }

    public double calcularPrecioReserva(RelacionNM[] relaciones, int totalRelaciones) {
        double precioUnitario = 0.0;
        if (relaciones != null) {
            for (int i = 0; i < totalRelaciones; i++) {
                if (relaciones[i] != null
                        && relaciones[i].getIdEstacionOrigen() == this.idEstacionSalida
                        && relaciones[i].getIdEstacionDestino() == this.idEstacionLlegada) {
                    precioUnitario = relaciones[i].getPrecio();
                    break;
                }
            }
        }
        return precioUnitario * numAsientosReservados;
    }

    public void mostrarDetalleReserva(Tren[] trenes, int totalTrenes,
                                      Estacion[] estaciones, int totalEstaciones,
                                      RelacionNM[] relaciones, int totalRelaciones) {
        String nombreSalida = buscarNombreEstacion(idEstacionSalida, estaciones, totalEstaciones);
        String nombreLlegada = buscarNombreEstacion(idEstacionLlegada, estaciones, totalEstaciones);
        String infoTren = buscarInfoTren(idTren, trenes, totalTrenes);
        double precioTotal = calcularPrecioReserva(relaciones, totalRelaciones);

        System.out.println("Codigo: " + codigoReserva);
        System.out.println("Tren: " + infoTren);
        System.out.println("Estacion de salida: " + nombreSalida);
        System.out.println("Estacion de destino: " + nombreLlegada);
        System.out.println("Hora de viaje: " + horaViaje);
        System.out.println("Hora de llegada a cada estacion: (por calcular con recorrido y tiempos)");
        System.out.println("Duracion del viaje: (por calcular con tramos del recorrido)");
        System.out.print("Asientos: ");
        if (numAsientosReservados == 0) {
            System.out.println("Ninguno");
        } else {
            for (int i = 0; i < numAsientosReservados; i++) {
                System.out.print(idsAsientosReservados[i]);
                if (i < numAsientosReservados - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println("Precio: " + precioTotal);
        System.out.println("------------------------------------");
    }

    private String buscarNombreEstacion(int idEstacion, Estacion[] estaciones, int totalEstaciones) {
        if (estaciones != null) {
            for (int i = 0; i < totalEstaciones; i++) {
                if (estaciones[i] != null && estaciones[i].getIdEstacion() == idEstacion) {
                    return estaciones[i].getNombre();
                }
            }
        }
        return "Estacion ID " + idEstacion;
    }

    private String buscarInfoTren(int idTren, Tren[] trenes, int totalTrenes) {
        if (trenes != null) {
            for (int i = 0; i < totalTrenes; i++) {
                if (trenes[i] != null && trenes[i].getIdTren() == idTren) {
                    return "Tren ID " + trenes[i].getIdTren() + " (Salida: " + trenes[i].getHoraSalida() + ")";
                }
            }
        }
        return "Tren ID " + idTren;
    }

    public void consultarReservasPasajero(int idPasajero, Reserva[] todasLasReservas, int totalReservas,
                                          Tren[] trenes, int totalTrenes,
                                          Estacion[] estaciones, int totalEstaciones,
                                          RelacionNM[] relaciones, int totalRelaciones) {
        int[] indicesPasajero = new int[totalReservas];
        int numEncontradas = 0;

        for (int i = 0; i < totalReservas; i++) {
            if (todasLasReservas[i] != null && todasLasReservas[i].getIdPasajero() == idPasajero) {
                indicesPasajero[numEncontradas] = i;
                numEncontradas++;
            }
        }

        if (numEncontradas == 0) {
            System.out.println("El pasajero no tiene reservas.");
            return;
        }

        System.out.println("=== VIAJES PENDIENTES DE REALIZAR ===");
        for (int i = 0; i < numEncontradas; i++) {
            Reserva r = todasLasReservas[indicesPasajero[i]];
            if (!r.isRealizado()) {
                r.mostrarDetalleReserva(trenes, totalTrenes, estaciones, totalEstaciones, relaciones, totalRelaciones);
            }
        }

        System.out.println("=== VIAJES YA REALIZADOS ===");
        int viajesRealizados = 0;
        double importeTotalGastado = 0.0;

        for (int i = 0; i < numEncontradas; i++) {
            Reserva r = todasLasReservas[indicesPasajero[i]];
            if (r.isRealizado()) {
                r.mostrarDetalleReserva(trenes, totalTrenes, estaciones, totalEstaciones, relaciones, totalRelaciones);
                viajesRealizados++;
                importeTotalGastado += r.calcularPrecioReserva(relaciones, totalRelaciones);
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Numero de viajes realizados: " + viajesRealizados);
        System.out.println("Importe total gastado: " + importeTotalGastado);
    }
}
