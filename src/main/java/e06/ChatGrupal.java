package e06;

import java.util.ArrayList;
import java.util.List;

public class ChatGrupal implements IMediatorDevelopers, IStrategyCommunication {
    private String name;
    private List<Usuario> usersList = new ArrayList<>();

    public ChatGrupal(String name) {
        this.name = name;
    }

    @Override
    public void send(String msg, Usuario emisor) {
        for (Usuario user : usersList) {
            if (!emisor.equals(user)) {
                user.messageRecieved(msg, emisor);
            }
        }
    }

    public ChatGrupal addUser(Usuario user){
        usersList.add(user);
        return this;
    }
}
