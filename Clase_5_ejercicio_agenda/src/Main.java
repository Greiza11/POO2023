import java.util.Formatter;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        new Main().run();
    }

    public void run() {
        Agenda agenda = new Agenda();
        Familia familia = new Familia(
                "Greivin",
                22,
                "Las Delicias de Aguas Zarcas",
                623777788,
                "grevin@gmail.com",
                "padre"
        );
        Amigo amigo = new Amigo(
                "Greivin",
                22,
                "Las Delicias de Aguas Zarcas",
                623777788,
                "grevin@gmail.com",
                "mae"
        );
        Trabajo trabajo = new Trabajo(
                "Greivin",
                22,
                "Las Delicias de Aguas Zarcas",
                623777788,
                "grevin@gmail.com",
                "Gerente"
        );
        Evento evento = new Evento("reunion", "padres de familia");
        agenda.addContacto(familia);
        agenda.addContacto(amigo);
        agenda.addContacto(trabajo);
        agenda.addContacto(evento);
        imprimirEncabezado();

        agenda.verContactos();
    }

    public void imprimirEncabezado() {
        System.out.println(HeaderString());
        //   lista.forEach();
    }

    private String HeaderString() {
        Formatter formatter = new Formatter();
        return formatter.format("%-35s%-40s%-35s%-35s%-35s%-35s%-35s%n", "NOMBRE", "EDAD", "DIRECCION", "TIPO", "NUMERO", "CORREO", "OTRO")
                + new Ex().lineaEspacio();

    }
}