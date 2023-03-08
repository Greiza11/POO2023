package clases;

import clases.carros.Carro;
import clases.personas.Cliente;

public class Reserva {
    private Cliente cliente;
    private Carro carro;

    public Reserva(Cliente cliente, Carro carro) {
        this.cliente = cliente;
        this.carro = carro;
    }
}
