package e05;

public class Desarrollador implements ISuscriptor {
    private String name;
    private String ci;

    public Desarrollador(String name, String ci) {
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

    @Override
    public void recibirNotificacion(String msg) {
        System.out.println(this.name+": Notificacion >> "+ msg);
    }
}
