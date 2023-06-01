import java.util.Formatter;

public class Amigo extends Contacto {
    private String apodo;

    public Amigo(String nombre, int edad, String direccion, long telefono, String correo, String apodo) {
        super(nombre, edad, direccion, telefono, correo);
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        Ex ex = new Ex();
        Formatter formatter = new Formatter();
        return formatter.format("%-35s%-40s%-35s%-35s%-35s%n", super.getNombre(), super.getEdad(), super.getDireccion(), "Amigo", this.apodo).toString()
                + "\n" + ex.lineaEspacio();
    }

    @Override
    public void imprimir() {
        System.out.println(this);
    }
}
