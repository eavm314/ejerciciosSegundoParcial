package e02;

public interface IMilicia {
    IMilicia next();
    void setNext(IMilicia next);
    void atenderOrden(String orden);
}
