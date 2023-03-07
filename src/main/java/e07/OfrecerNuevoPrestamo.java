package e07;

public class OfrecerNuevoPrestamo implements IStrategyPrestamos{
    @Override
    public void accion() {
        System.out.println("Recomendacion: contratar nuevo prestamo");
    }
}
