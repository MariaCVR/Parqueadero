public class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta(String matricula, String modelo, String color, String tipo) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.tipo = tipo;
    }

    @Override
    public String obtenerDetalles() {
        return "Bicicleta: " + modelo + ", Matrícula: " + matricula + ", Color: " + color + ", Tipo: " + tipo;
    }
}