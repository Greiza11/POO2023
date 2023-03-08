package clases.carros;

import clases.Exposicion;
import clases.carros.reparaciones.Reparacion;

import java.util.ArrayList;

public class RentaCar extends Carro {
    public RentaCar(String marca, String modelo, String matricula, int precioCompra, int precioVenta, Exposicion exposicion, ArrayList<Reparacion> reparaciones) {
        super(marca, modelo, matricula, precioCompra, precioVenta, exposicion, reparaciones);
    }
}
