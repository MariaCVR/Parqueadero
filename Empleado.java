public class Empleado {
    private int id;
    public String nombre;
    public String tipo; // supervisor/cajero

    public Empleado(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void gestionarOperaciones() {
        // Lógica para gestionar operaciones
    }
}
