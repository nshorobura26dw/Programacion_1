public class Pasajero {
    private int idPasajero;
    private String nombre;
    private String apellidos;
    private String dni;
    private String email;
    private String password;

    public Pasajero() {
    }

    public Pasajero(int idPasajero, String nombre, String apellidos, String dni, String email, String password) {
        this.idPasajero = idPasajero;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
        this.password = password;
    }

    public int getIdPasajero() {
        return idPasajero;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
