public class Reserva {
    private int id;
    private Plaza plaza;
    private Usuario usuario;
    public String fechaReserva;

    public Reserva(int id, Plaza plaza, Usuario usuario, String fechaReserva) {
        this.id = id;
        this.plaza = plaza;
        this.usuario = usuario;
        this.fechaReserva = fechaReserva;
    }

    // Métodos adicionales según sea necesario
}