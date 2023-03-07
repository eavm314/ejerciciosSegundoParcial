package e02;

public class Coronel implements IMilicia{
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
        if (orden.equals("disciplina")){
            System.out.println("Coronel atendiendo disciplina...");
        } else if (next != null) {
            System.out.println("Coronel no puede atender la orden...");
            next.atenderOrden(orden);
        } else {
            throw new RuntimeException("La orden no se puede atender");
        }
    }
}
