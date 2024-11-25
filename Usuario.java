public class Usuario {
    private int id;
    public String nombre;
    public String tipo; // regular/visitante

    public Usuario(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void realizarReserva() {
        // Lógica para realizar una reserva
    }

    public void pagar() {
        // Lógica para procesar el pago
    }
}