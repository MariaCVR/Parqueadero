import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private int id;
    public String nombre;
    public String tipo; // público o privado
    private List<Piso> pisos;

    public Parqueadero(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.pisos = new ArrayList<>();
    }

    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    public void eliminarPiso(Piso piso) {
        pisos.remove(piso);
    }

    public List<Piso> listarPisos() {
        return pisos;
    }
}
