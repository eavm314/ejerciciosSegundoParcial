package e05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Github implements ICanal{
    private Map<String, CommitProyecto> registro = new HashMap<>();

    private List<ISuscriptor> suscriptorsList = new ArrayList<>();

    public Map<String, CommitProyecto> getRegistro() {
        return registro;
    }

    public void saveBackup(String key, CommitProyecto backup){
        registro.put(key, backup);
    }

    public Proyecto restore(String key){
        if (!registro.containsKey(key)){
            throw new RuntimeException("No existe un backup con la clave solicitada");
        }
        notifyObservers(key);
        return registro.get(key).getProyecto();
    }

    @Override
    public void suscribir(ISuscriptor observer) {
        suscriptorsList.add(observer);
    }

    @Override
    public void desuscribir(ISuscriptor observer) {
        suscriptorsList.remove(observer);
    }

    @Override
    public void notifyObservers(String commit) {
        for (ISuscriptor sub : suscriptorsList) {
            sub.recibirNotificacion("El proyecto se ha restaurado al commit '"+commit+"'");
        }
    }
}
