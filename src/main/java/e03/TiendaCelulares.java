package e03;

import java.util.ArrayList;
import java.util.List;

public class TiendaCelulares {
    private List<Celular> celularesALaVenta = new ArrayList<>();
    private IStrategyBusqueda strategyBusqueda;

    public List<Celular> getCelularesALaVenta() {
        return celularesALaVenta;
    }

    public TiendaCelulares addCelular(Celular celular){
        celularesALaVenta.add(celular);
        return this;
    }

    public IStrategyBusqueda getStrategyBusqueda() {
        return strategyBusqueda;
    }

    public void setStrategyBusqueda(IStrategyBusqueda strategyBusqueda) {
        this.strategyBusqueda = strategyBusqueda;
    }

    public void buscarCelulares(String marca, int precio){
        System.out.println("Buscando celulares de la marca '"+marca+"' y precio menor a '"+precio+"':");

        int value = 5;
        if (celularesALaVenta.size() < value){
            strategyBusqueda = new BusquedaPocosCelulares();
        } else {
            strategyBusqueda = new BusquedaMuchosCelulares();
        }
        List<Celular> celularesSolicitados = strategyBusqueda.execute(celularesALaVenta, marca, precio);

        if (celularesSolicitados.isEmpty()){
            System.out.println("Ho hay celulares disponibles con las especificaciones solicitadas");
        }

        for (Celular cel : celularesSolicitados) {
            System.out.println(cel);
        }
        System.out.println("**************************************************");
    }
}
