package e03;

import java.util.List;

public class BusquedaMuchosCelulares implements IStrategyBusqueda {
    @Override
    public List<Celular> execute(List<Celular> celularList, String marca, int precio) {
        if (marca.isBlank() && precio <= 0) {
            return celularList;
        }

        if (marca.isBlank()) {
            return celularList.stream().filter(celular -> celular.getPrecio() < precio).toList();
        }

        if (precio <= 0) {
            return celularList.stream().filter(celular -> celular.getMarca().equalsIgnoreCase(marca)).toList();
        }

        return celularList.stream()
                .filter(celular ->
                        celular.getMarca().equalsIgnoreCase(marca) && celular.getPrecio() < precio)
                .toList();
    }
}
