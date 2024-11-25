public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String matricula, String modelo, String color, int numeroPuertas) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String obtenerDetalles() {
        return "Automóvil: " + modelo + ", Matrícula: " + matricula + ", Color: " + color + ", Puertas: " + numeroPuertas;
    }
}