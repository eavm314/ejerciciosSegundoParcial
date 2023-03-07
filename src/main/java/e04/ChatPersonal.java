package e04;

public class ChatPersonal implements IMediatorWhatsapp {
    private Usuario user1;
    private Usuario user2;

    public ChatPersonal(Usuario user1, Usuario user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    @Override
    public void send(String msg, Usuario emisor) {
        if (emisor.equals(user1)){
            user2.messageRecieved(msg,user1);
        } else {
            user1.messageRecieved(msg,user2);
        }
    }
}
