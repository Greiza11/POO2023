package clases.carros;

import clases.Exposicion;
import clases.carros.reparaciones.Reparacion;

import java.util.ArrayList;

public class TodoTerreno extends Carro {

    public TodoTerreno(String marca, String modelo, String matricula, int precioCompra, int precioVenta, Exposicion exposicion, ArrayList<Reparacion> reparaciones) {
        super(marca, modelo, matricula, precioCompra, precioVenta, exposicion, reparaciones);
    }
}
