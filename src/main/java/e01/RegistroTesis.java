package e01;

import java.util.HashMap;
import java.util.Map;

public class RegistroTesis {
    private Map<String,TesisBackup> registro = new HashMap<>();

    public Map<String, TesisBackup> getRegistro() {
        return registro;
    }

    public void saveBackup(String key, TesisBackup backup){
        registro.put(key, backup);
    }

    public Tesis restore(String key){
        if (!registro.containsKey(key)){
            throw new RuntimeException("No existe un backup con la clave solicitada");
        }
        return registro.get(key).getTesis();
    }
}
