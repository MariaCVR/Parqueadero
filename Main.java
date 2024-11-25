public class Main {
    public static void main(String[] args) {
        // Crear un parqueadero
        Parqueadero parqueadero = new Parqueadero(1, "Parqueadero Central", "público");

        // Crear pisos y agregarlos al parqueadero
        Piso piso1 = new Piso(1, 1);
        Piso piso2 = new Piso(2, 2);
        parqueadero.agregarPiso(piso1);
        parqueadero.agregarPiso(piso2);

        // Crear plazas y agregarlas a los pisos
        Plaza plaza1 = new Plaza(1, 101);
        Plaza plaza2 = new Plaza(2, 102);
        piso1.agregarPlaza(plaza1);
        piso1.agregarPlaza(plaza2);

        // Crear un cliente regular y un visitante
        ClienteRegular clienteRegular = new ClienteRegular(1, "Juan Pérez", true, "Tarjeta de Crédito");
        Visitante visitante = new Visitante(2, "Ana Gómez", 120);

        // Realizar una reserva
        Reserva reserva = new Reserva(1, plaza1, clienteRegular, "2024-11-25");

        // Mostrar detalles de la reserva
        System.out.println("Reserva realizada por: " + clienteRegular.nombre);
        System.out.println("Plaza reservada: " + plaza1.numero);
        System.out.println("Fecha de reserva: " + reserva.fechaReserva);
    }
}
