package e06;

public class Desarrollador extends Usuario {
    private String username;

    public Desarrollador(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return username;
    }

    @Override
    public void send(String msg) {
        mediator.send(msg,this);
    }
}
