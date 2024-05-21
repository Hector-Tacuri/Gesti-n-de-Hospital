public abstract class Persona {
    private String nombre;
    private final String identificacion;
    private String direccion;

    public Persona(String nombre, String identificacion, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}