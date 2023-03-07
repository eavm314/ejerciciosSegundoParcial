package e03;

import java.util.List;

public interface IStrategyBusqueda {
    List<Celular> execute(List<Celular> celularList, String marca, int precio);
}
