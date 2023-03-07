package e04;

public class UsuarioWhatsapp extends Usuario {
    private String name;
    private String numCelular;

    public UsuarioWhatsapp(String name, String numCelular) {
        this.name = name;
        this.numCelular = numCelular;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public void meetUser(UsuarioWhatsapp user) {
        if (!mediatorsMap.containsKey(user.getNumCelular())) {
            ChatPersonal newChat = new ChatPersonal(this, user);
            mediatorsMap.put(user.getNumCelular(), newChat);
            user.getMediatorsMap().put(numCelular, newChat);
        }
    }

    @Override
    public String toString() {
        return name + " ("+numCelular+")";
    }
}
