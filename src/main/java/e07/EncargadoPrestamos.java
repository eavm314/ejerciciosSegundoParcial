package e07;

public class EncargadoPrestamos implements ITrabajadorBanco {
    private ITrabajadorBanco next;
    @Override
    public ITrabajadorBanco next() {
        return next;
    }

    @Override
    public void setNext(ITrabajadorBanco next) {
        this.next = next;
    }

    @Override
    public void atenderPrestamo(Prestamo prestamo) {
        if (prestamo.getPorcentajePagado()==1){
            System.out.println("Encargado de prestamos atendiendo recibiendo pago...");
            prestamo.getEstrategia().accion();
        } else {
            throw new RuntimeException("La orden no se puede atender");
        }
    }
}
