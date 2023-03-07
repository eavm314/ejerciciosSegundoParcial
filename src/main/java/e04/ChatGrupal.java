package e04;

import java.util.ArrayList;
import java.util.List;

public class ChatGrupal implements IMediatorWhatsapp {
    private String name;
    private String code;
    private List<Usuario> usersList = new ArrayList<>();

    public ChatGrupal(String name, String code) {
        this.name = name;
        this.code = code;
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
        user.getMediatorsMap().put(this.code, this);
        return this;
    }
}
