package e07;

public class Prestamo {
    private int montoTotal;
    private int montoPagado = 0;
    private double porcentajePagado = 0;

    private IStrategyPrestamos estrategia;

    public Prestamo(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public double getPorcentajePagado() {
        return porcentajePagado;
    }

    public void setPorcentajePagado(double porcentajePagado) {
        this.porcentajePagado = porcentajePagado;
    }

    public void pagar(int monto){
        montoPagado+=monto;
        porcentajePagado = (double) montoPagado/ (double) montoTotal;
        if (porcentajePagado<0.25){
            return;
        }
        if (porcentajePagado<0.5){
            estrategia = new RefinanciarPrestamo();
        } else if (porcentajePagado < 1) {
            estrategia = new OfrecerNuevoPrestamo();
        } else {
            estrategia = new DevolverDocumentos();
        }
    }

    public IStrategyPrestamos getEstrategia() {
        return estrategia;
    }
}
