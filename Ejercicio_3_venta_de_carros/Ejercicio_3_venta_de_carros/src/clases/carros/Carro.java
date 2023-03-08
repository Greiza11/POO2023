package clases.carros;

import clases.Exposicion;
import clases.carros.reparaciones.Reparacion;

import java.util.ArrayList;

public class Carro {
    private String marca;
    private String modelo;
    private String matricula;
    private int precioCompra;
    private int precioVenta;
    private Exposicion exposicion;
    private ArrayList<Reparacion> reparaciones = new ArrayList<>();

    public Carro(String marca, String modelo, String matricula, int precioCompra, int precioVenta, Exposicion exposicion, ArrayList<Reparacion> reparaciones) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.exposicion = exposicion;
        this.reparaciones = reparaciones;
    }

    public void agregarReparacion(Reparacion reparacion) {
        this.reparaciones.add(reparacion);
    }
}
