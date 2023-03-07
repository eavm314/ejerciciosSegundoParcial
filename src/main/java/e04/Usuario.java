package e04;

import java.util.HashMap;
import java.util.Map;

public abstract class Usuario{
    protected Map<String, IMediatorWhatsapp> mediatorsMap = new HashMap<>();

    public Map<String, IMediatorWhatsapp> getMediatorsMap() {
        return mediatorsMap;
    }

    public void send(String msg, String destinatario) {
        if (!mediatorsMap.containsKey(destinatario)){
            throw new RuntimeException("No existe el destinatario "+destinatario);
        }
        mediatorsMap.get(destinatario).send(msg,this);
    }

    public void messageRecieved(String msg, Usuario emisor) {
        System.out.println(this+": "+emisor+" envió un mensaje >> "+msg);
    }
}
