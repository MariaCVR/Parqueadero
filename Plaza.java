public class Plaza {
    private int id;
    public int numero;
    public String estado; // ocupada/libre

    public Plaza(int id, int numero) {
        this.id = id;
        this.numero = numero;
        this.estado = "libre";
    }

    public void reservar() {
        this.estado = "ocupada";
    }

    public void liberar() {
        this.estado = "libre";
    }
}