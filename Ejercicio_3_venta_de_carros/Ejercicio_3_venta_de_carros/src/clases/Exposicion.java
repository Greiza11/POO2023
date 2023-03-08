package clases;

import clases.carros.Carro;

import java.util.ArrayList;

public class Exposicion {
    private String direccion;
    private ArrayList<Carro> carros;

    public Exposicion(String direccion, ArrayList<Carro> carros) {
        this.direccion = direccion;
        this.carros = carros;
    }

    public void agregarNuevoCarro(Carro carro) {
        this.carros.add(carro);
    }
}
