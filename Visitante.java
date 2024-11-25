public class Visitante extends Usuario {
    private int tiempoUtilizado;

    public Visitante(int id, String nombre, int tiempoUtilizado) {
        super(id, nombre, "visitante");
        this.tiempoUtilizado = tiempoUtilizado;
    }

    public void pagarPorTiempo() {
        // Lógica para pagar por el tiempo utilizado
    }
}
