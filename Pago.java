public class Pago {
    private int id;
    private Usuario usuario;
    private double monto;
    private String fechaPago;

    public Pago(int id, Usuario usuario, double monto, String fechaPago) {
        this.id = id;
        this.usuario = usuario;
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    // Métodos adicionales según sea necesario
}