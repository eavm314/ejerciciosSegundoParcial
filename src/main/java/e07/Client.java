package e07;

public class Client {
    public static void main(String[] args) {
        Persona persona = new Persona("Gonzalo", "742931");
        Prestamo prestamo = new Prestamo(1000);

        persona.pagarPrestamo(prestamo, 200);
        persona.pagarPrestamo(prestamo, 100);
        persona.pagarPrestamo(prestamo, 100);
        persona.pagarPrestamo(prestamo, 200);
        persona.pagarPrestamo(prestamo, 100);
        persona.pagarPrestamo(prestamo, 300);
    }
}