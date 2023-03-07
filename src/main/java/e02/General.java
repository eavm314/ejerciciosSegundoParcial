package e02;

public class General implements IMilicia{
    private IMilicia next;
    @Override
    public IMilicia next() {
        return next;
    }

    @Override
    public void setNext(IMilicia next) {
        this.next = next;
    }

    @Override
    public void atenderOrden(String orden) {
        if (orden.equals("entrevistas")){
            System.out.println("General atendiendo entrevistas...");
        } else if (next != null) {
            System.out.println("General no puede atender la orden...");
            next.atenderOrden(orden);
        } else {
            throw new RuntimeException("La orden no se puede atender");
        }
    }
}
