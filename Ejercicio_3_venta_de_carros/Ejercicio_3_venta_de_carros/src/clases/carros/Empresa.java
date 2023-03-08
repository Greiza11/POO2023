package clases.carros;

import clases.Venta;
import clases.personas.Cliente;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Venta> ventas = new ArrayList<>();
    private ArrayList<Carro> carros = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public Cliente obtenerVenta(Carro carro) {
        final Venta[] venta = new Venta[1];
        this.ventas.forEach(item -> {
            if (item.getCarro().equals(carro)) {
                venta[0] = item;
            }
        });
        return venta[0].getCliente();
    }

    public ArrayList<Carro> obtenerStock() {
        return this.carros;
    }
}
