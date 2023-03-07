package e06;

import java.util.HashMap;
import java.util.Map;

public abstract class Usuario{
    protected IMediatorDevelopers mediator;

    public IMediatorDevelopers getMediator() {
        return mediator;
    }

    public void setMediator(IMediatorDevelopers mediator) {
        this.mediator = mediator;
    }

    public abstract void send(String msg);

    public void messageRecieved(String msg, Usuario emisor) {
        System.out.println(this+": "+emisor+" envió un mensaje >> "+msg);
    }
}
