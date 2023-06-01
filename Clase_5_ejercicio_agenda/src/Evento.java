public class Evento implements ItemAgenda {
    private String nombreEvento;
    private String descripcion;

    public Evento(String nombreEvento, String descripcion) {
        this.nombreEvento = nombreEvento;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nombreEvento='" + nombreEvento + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println(this);
    }
}

