import java.util.ArrayList;
import java.util.List;

public class Piso {
    private int id;
    public int numero;
    private List<Plaza> plazas;

    public Piso(int id, int numero) {
        this.id = id;
        this.numero = numero;
        this.plazas = new ArrayList<>();
    }

    public void agregarPlaza(Plaza plaza) {
        plazas.add(plaza);
    }

    public void eliminarPlaza(Plaza plaza) {
        plazas.remove(plaza);
    }

    public List<Plaza> listarPlazas() {
        return plazas;
    }
}