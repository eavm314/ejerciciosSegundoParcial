package e06;

public class Client {
    public static void main(String[] args) {
        Desarrollador user1 = new Desarrollador("eavm");
        Desarrollador user2 = new Desarrollador("noobmaster");
        Desarrollador user3 = new Desarrollador("espartakus");
        Desarrollador user4 = new Desarrollador("batman");
        Desarrollador user5 = new Desarrollador("jojo");

        ChatPersonal chat = new ChatPersonal(user1,user2);

        user1.setMediator(chat);
        user1.send("Acabo de subir un archivo que se conecta con el tuyo");

        System.out.println("**********************************");

        ChatGrupal group1 = new ChatGrupal("DevGroup");
        group1.addUser(user1).addUser(user2)
                .addUser(user3).addUser(user4)
                .addUser(user5);

        user1.setMediator(group1);
        user1.send("Realizaré las pruebas del ultimo achivo subido");

    }
}