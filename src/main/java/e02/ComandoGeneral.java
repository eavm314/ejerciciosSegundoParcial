package e02;

public class ComandoGeneral implements IMilicia{
    private IMilicia next;

    public ComandoGeneral(){
        next = new Cabo();
        next.setNext(new Teniente());
        next.next().setNext(new Coronel());
        next.next().next().setNext(new General());
    }
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
        if (next != null) {
            next.atenderOrden(orden);
        } else {
            throw new RuntimeException("La orden no se puede atender");
        }
    }
}
