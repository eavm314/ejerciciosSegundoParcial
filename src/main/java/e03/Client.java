package e03;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        TiendaCelulares tienda = new TiendaCelulares();
        tienda.addCelular(new Celular("a10","samsung", "baja", 1600))
                .addCelular(new Celular("redmi10","xiaomi", "baja", 800))
                .addCelular(new Celular("a50","samsung", "media", 2800))
                .addCelular(new Celular("f15","xiaomi", "alta", 3800));

        tienda.buscarCelulares("samsung",0);
        tienda.buscarCelulares("",3000);
        tienda.buscarCelulares("samsung",2000);

        tienda.addCelular(new Celular("p60","huawei", "alta", 5000))
                .addCelular(new Celular("redmi20","xiaomi", "media", 2600))
                .addCelular(new Celular("s20","samsung", "alta", 3200))
                .addCelular(new Celular("p15","huawei", "baja", 900));

        tienda.buscarCelulares("samsung",3000);
        tienda.buscarCelulares("",1000);
        tienda.buscarCelulares("huawei",0);
        tienda.buscarCelulares("xiaomi",500);

    }
}