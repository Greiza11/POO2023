package clases;

import clases.carros.Carro;

import java.util.ArrayList;

public class Proveedor {
    private String nombre;
    private ArrayList<Carro> carros = new ArrayList<>();

    public Proveedor(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCarro(Carro carro) {
        this.carros.add(carro);
    }
}
