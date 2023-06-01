import java.util.Formatter;

public class Trabajo extends Contacto {
    private String puestoTrabajo;

    public Trabajo(String nombre, int edad, String direccion, long telefono, String correo, String puestoTrabajo) {
        super(nombre, edad, direccion, telefono, correo);
        this.puestoTrabajo = puestoTrabajo;
    }

    @Override
    public String toString() {
        Ex ex = new Ex();
        Formatter formatter = new Formatter();
        return formatter.format("%-35s%-40s%-35s%-35s%-35s%n", super.getNombre(), super.getEdad(), super.getDireccion(), "Trabajo", this.puestoTrabajo).toString()
                + "\n" + ex.lineaEspacio();
    }

    @Override
    public void imprimir() {
        System.out.println(this);
    }
}
