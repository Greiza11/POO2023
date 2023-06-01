public abstract class Contacto extends Persona implements ItemAgenda {
    private long telefono;
    private String correo;

    public Contacto(String nombre, int edad, String direccion, long telefono, String correo) {
        super(nombre, edad, direccion);
        this.telefono = telefono;
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "telefono=" + telefono +
                ", correo='" + correo + '\'' +
                super.toString() +
                '}';
    }
}
