package clases.personas;

public class Persona {
    private int cedula;
    private String nombre;
    private int edad;
    private String correoElectronico;
    private String direccionFisica;

    public Persona(int cedula, String nombre, int edad, String correoElectronico, String direccionFisica) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
        this.direccionFisica = direccionFisica;
    }

}
