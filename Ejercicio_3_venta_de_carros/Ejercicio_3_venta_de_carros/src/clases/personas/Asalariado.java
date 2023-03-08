package clases.personas;

public class Asalariado extends Vendedor {
    private int salario;


    public Asalariado(int cedula, String nombre, int edad, String correoElectronico, String direccionFisica, int salario) {
        super(cedula, nombre, edad, correoElectronico, direccionFisica);
        this.salario = salario;
    }
}
