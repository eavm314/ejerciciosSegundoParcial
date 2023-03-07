package e04;

public class Client {
    public static void main(String[] args) {
        UsuarioWhatsapp user1 = new UsuarioWhatsapp("Enrique","87658332");
        UsuarioWhatsapp user2 = new UsuarioWhatsapp("Ander","11847632");
        UsuarioWhatsapp user3 = new UsuarioWhatsapp("Jose","38291931");
        UsuarioWhatsapp user4 = new UsuarioWhatsapp("Vivian","77847632");
        UsuarioWhatsapp user5 = new UsuarioWhatsapp("Dylan","10947632");
        UsuarioWhatsapp user6 = new UsuarioWhatsapp("Brenda","29847032");
        UsuarioWhatsapp user7 = new UsuarioWhatsapp("Maria","91867633");
        UsuarioWhatsapp user8 = new UsuarioWhatsapp("Carlos","95847673");
        UsuarioWhatsapp user9 = new UsuarioWhatsapp("Antonio","41842176");
        UsuarioWhatsapp user10 = new UsuarioWhatsapp("Daniela","84763222");

        user1.meetUser(user2);
        user1.send("hola ander", "11847632");
        user2.send("hola enrique", "87658332");

        System.out.println("**********************************");


        ChatGrupal group1 = new ChatGrupal("Patrones de Disenio", "pdd911");
        group1.addUser(user1).addUser(user2)
                .addUser(user3).addUser(user4)
                .addUser(user5).addUser(user6)
                .addUser(user7).addUser(user8)
                .addUser(user9).addUser(user10);

        user10.send("Hola grupo!!!", "pdd911");

    }
}