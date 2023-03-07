package e07;

public class RefinanciarPrestamo implements IStrategyPrestamos{
    @Override
    public void accion() {
        System.out.println("Recomendacion: refinanciar prestamo");
    }
}
