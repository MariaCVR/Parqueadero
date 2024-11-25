public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String matricula, String modelo, String color, int cilindrada) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.cilindrada = cilindrada;
    }

    @Override
    public String obtenerDetalles() {
        return "Motocicleta: " + modelo + ", Matrícula: " + matricula + ", Color: " + color + ", Cilindrada: " + cilindrada;
    }
}