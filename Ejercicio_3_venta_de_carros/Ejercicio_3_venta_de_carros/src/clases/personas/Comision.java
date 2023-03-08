package clases.personas;

import clases.carros.Carro;

import java.util.ArrayList;

public class Comision extends Vendedor {
    private ArrayList<Carro> carrosVendidos = new ArrayList<>();

    public Comision(int cedula, String nombre, int edad, String correoElectronico, String direccionFisica) {
        super(cedula, nombre, edad, correoElectronico, direccionFisica);
    }

    public void agregarCarro(Carro carro) {
        this.carrosVendidos.add(carro);
    }
}
