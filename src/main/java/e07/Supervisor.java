package e07;

public class Supervisor implements ITrabajadorBanco {
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
        if (prestamo.getPorcentajePagado()<1){
            System.out.println("Supervisor recibiendo pago...");
            prestamo.getEstrategia().accion();
        } else if (next != null) {
            System.out.println("Supervisor no puede atender la orden...");
            next.atenderPrestamo(prestamo);
        } else {
            throw new RuntimeException("La orden no se puede atender");
        }
    }
}
