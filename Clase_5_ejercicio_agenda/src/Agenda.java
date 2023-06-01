import java.util.Formatter;
import java.util.LinkedList;

public class Agenda {
    LinkedList<ItemAgenda> itemsAgenda = new LinkedList<>();

    public void addContacto(ItemAgenda ItemAgenda) {
        this.itemsAgenda.add(ItemAgenda);
    }

    public void verContactos() {
        this.itemsAgenda.forEach(ItemAgenda::imprimir);

    }
}

