public class Tren {
    private int idTren;
    private int idRecorrido;
    private String horaSalida;
    private int numFilas;

    // Maximo 100 filas * 4 asientos (A, B, C, D) = 400 asientos
    private int[] idAsientos;
    private int[] filasAsientos;
    private char[] letrasAsientos;
    private String[] codigosAsientos;
    private boolean[] asientosLibres;
    private int numAsientos;

    public Tren() {
        this.idAsientos = new int[400];
        this.filasAsientos = new int[400];
        this.letrasAsientos = new char[400];
        this.codigosAsientos = new String[400];
        this.asientosLibres = new boolean[400];
        this.numAsientos = 0;
    }

    public Tren(int idTren, int idRecorrido, String horaSalida, int numFilas) {
        this();
        this.idTren = idTren;
        this.idRecorrido = idRecorrido;
        this.horaSalida = horaSalida;
        setNumFilas(numFilas);
        generarAsientos();
    }

    public void generarAsientos() {
        char[] letras = {'A', 'B', 'C', 'D'};
        int contador = 0;
        int idAuto = 1;

        for (int fila = 1; fila <= numFilas; fila++) {
            for (int i = 0; i < letras.length; i++) {
                idAsientos[contador] = idAuto;
                filasAsientos[contador] = fila;
                letrasAsientos[contador] = letras[i];
                codigosAsientos[contador] = fila + "" + letras[i];
                asientosLibres[contador] = true;
                contador++;
                idAuto++;
            }
        }
        numAsientos = contador;
    }

    public int getIdTren() {
        return idTren;
    }

    public void setIdTren(int idTren) {
        this.idTren = idTren;
    }

    public int getIdRecorrido() {
        return idRecorrido;
    }

    public void setIdRecorrido(int idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(int numFilas) {
        if (numFilas < 1) {
            this.numFilas = 1;
        } else if (numFilas > 100) {
            this.numFilas = 100;
        } else {
            this.numFilas = numFilas;
        }
    }

    public int[] getIdAsientos() {
        return idAsientos;
    }

    public int[] getFilasAsientos() {
        return filasAsientos;
    }

    public char[] getLetrasAsientos() {
        return letrasAsientos;
    }

    public String[] getCodigosAsientos() {
        return codigosAsientos;
    }

    public boolean[] getAsientosLibres() {
        return asientosLibres;
    }

    public int getNumAsientos() {
        return numAsientos;
    }
}
