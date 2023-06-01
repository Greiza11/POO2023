import java.util.Formatter;

public class Familia extends Contacto {
    private String parentesco;

    public Familia(String nombre, int edad, String direccion, long telefono, String correo, String parentesco) {
        super(nombre, edad, direccion, telefono, correo);
        this.parentesco = parentesco;
    }

    @Override
    public String toString() {
        Ex ex = new Ex();
        Formatter formatter = new Formatter();
        return formatter.format("%-35s%-40s%-35s%-35s%-35s%-35s%-35s%n", super.getNombre(), super.getEdad(),
                super.getDireccion(),"Familia", getTelefono(), getCorreo(),
                "parentesto: " + this.parentesco).toString()
                + "\n" + ex.lineaEspacio();
    }

    @Override
    public void imprimir() {
        System.out.println(this);
    }
}
