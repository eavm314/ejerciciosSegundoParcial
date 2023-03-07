package e07;

public class Cajero implements ITrabajadorBanco {
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
        if (prestamo.getPorcentajePagado()<0.25){
            System.out.println("Cajero recibiendo pago...");
        } else if (next != null) {
            System.out.println("Cajero no puede atender la orden...");
            next.atenderPrestamo(prestamo);
        } else {
            throw new RuntimeException("La orden no se puede atender");
        }
    }

}
