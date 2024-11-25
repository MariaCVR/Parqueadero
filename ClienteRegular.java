public class ClienteRegular extends Usuario {
    private boolean suscripcionActiva;
    private String metodoPago;

    public ClienteRegular(int id, String nombre, boolean suscripcionActiva, String metodoPago) {
        super(id, nombre, "regular");
        this.suscripcionActiva = suscripcionActiva;
        this.metodoPago = metodoPago;
    }

    public void reservarPlaza() {
        // Lógica para reservar una plaza
    }
}