package clases;

import clases.carros.Carro;
import clases.personas.Cliente;

public class Venta {
    private Cliente cliente;
    private Carro carro;

    public Venta(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
