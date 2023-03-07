package e02;

public class Teniente implements IMilicia{
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
        if (orden.equals("desbloqueos") || orden.equals("manifestaciones")){
            System.out.println("Teniente atendiendo "+orden+"...");
        } else if (next != null) {
            System.out.println("Teneinte no puede atender la orden...");
            next.atenderOrden(orden);
        } else {
            throw new RuntimeException("La orden no se puede atender");
        }
    }
}
