package e07;

public class DevolverDocumentos implements IStrategyPrestamos{
    @Override
    public void accion() {
        System.out.println("Recomendacion: Devolvier Documentos");
    }
}
