package e07;

public class Banco implements ITrabajadorBanco {
    private static Banco instance;
    private ITrabajadorBanco next;

    private Banco(){
        next = new Cajero();
        next.setNext(new AgenteCredito());
        next.next().setNext(new Supervisor());
        next.next().next().setNext(new EncargadoPrestamos());
    }

    public static Banco getInstance() {
        if (instance == null) {
            instance = new Banco();
        }
        return instance;
    }

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
        if (next != null) {
            next.atenderPrestamo(prestamo);
        } else {
            throw new RuntimeException("La orden no se puede atender");
        }
    }
}
