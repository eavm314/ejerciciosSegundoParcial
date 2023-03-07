package e07;

public class Persona {
    private String name;
    private String ci;

    public Persona(String name, String ci) {
        this.name = name;
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void pagarPrestamo(Prestamo prestamo, int monto){
        prestamo.pagar(monto);
        Banco.getInstance().atenderPrestamo(prestamo);
        System.out.println("*************************************");
    }
}
