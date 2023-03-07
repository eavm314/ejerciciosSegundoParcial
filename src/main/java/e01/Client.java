package e01;

public class Client {
    public static void main(String[] args) {
        RegistroTesis registroTesis = new RegistroTesis();

        Tesis myTesis = new Tesis("La metamorfosis");

        myTesis.addContenido("La metamorfosis es un proceso...");
        registroTesis.saveBackup("v1", myTesis.createBackup());

        myTesis.addContenido("Los principios basicos sugieren que...");
        registroTesis.saveBackup("v2", myTesis.createBackup());

        myTesis.addContenido("Multiples estudios han demostrado...");
        registroTesis.saveBackup("v3", myTesis.createBackup());

        myTesis.addContenido("En nuestra realidad se experimenta de manera...");
        registroTesis.saveBackup("v4", myTesis.createBackup());

        myTesis.addContenido("Para concluir...");
        registroTesis.saveBackup("v5", myTesis.createBackup());

        myTesis.show();

        myTesis = registroTesis.restore("v3");
        myTesis.show();
    }
}