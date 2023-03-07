package e07;

public interface ITrabajadorBanco {
    ITrabajadorBanco next();
    void setNext(ITrabajadorBanco next);
    void atenderPrestamo(Prestamo prestamo);
}
