package e05;

public class Client {
    public static void main(String[] args) {
        Github github = new Github();

        Desarrollador dev1 = new Desarrollador("Eynar","7121");
        Desarrollador dev2 = new Desarrollador("Paul","8323");
        Desarrollador dev3 = new Desarrollador("Alexis","2743");

        github.suscribir(dev1);
        github.suscribir(dev2);
        github.suscribir(dev3);

        Proyecto proyecto = new Proyecto("AppPizzeria");
        proyecto.addFile("Pizza.java")
                .addFile("Tienda.java")
                .addFile("Main.java");
        github.saveBackup("commit01",proyecto.createBackup());

        proyecto.addFile("Hawaiana.java")
                .addFile("Carnivora.java");
        github.saveBackup("commit02", proyecto.createBackup());

        proyecto.addFile("Americana.java")
                .addFile("Italiana.java");
        github.saveBackup("commit03", proyecto.createBackup());

        proyecto.addFile("ModuloCompra.java")
                .addFile("CarritoDeCompra.java");
        github.saveBackup("commit04", proyecto.createBackup());

        proyecto.addFile("UIWeb.java")
                .addFile("UIMovil.java");
        github.saveBackup("commit05", proyecto.createBackup());



        proyecto = github.restore("commit01");
        proyecto.show();

        github.desuscribir(dev1);
        github.desuscribir(dev2);
        github.desuscribir(dev3);

        Desarrollador dev4 = new Desarrollador("Enrique","7941");
        Desarrollador dev5 = new Desarrollador("Ander","1279");
        Desarrollador dev6 = new Desarrollador("Jose","9418");
        github.suscribir(dev4);
        github.suscribir(dev5);
        github.suscribir(dev6);

        proyecto = github.restore("commit05");
        proyecto.show();

    }
}