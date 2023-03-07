package e03;

import java.util.ArrayList;
import java.util.List;

public class BusquedaPocosCelulares implements IStrategyBusqueda{
    @Override
    public List<Celular> execute(List<Celular> celularList, String marca, int precio) {
        if (marca.isBlank() && precio <= 0){
            return celularList;
        }

        List<Celular> filteredCelularList = new ArrayList<>();

        for (Celular cel : celularList) {
            if (marca.isBlank() && cel.getPrecio()<precio){
                filteredCelularList.add(cel);
            } else if (precio <= 0 && cel.getMarca().equalsIgnoreCase(marca)){
                filteredCelularList.add(cel);
            } else if (cel.getMarca().equalsIgnoreCase(marca) && cel.getPrecio()<precio){
                filteredCelularList.add(cel);
            }
        }
        return filteredCelularList;
    }
}
