package objetos;

public class App {
    public static void main(String[] args) {
        try {
            Usuarios user = new Usuarios();
            user.setNome("user test");
            user.setEmail("emailteste@teste.com");
        } catch (NullPointerException e) {
            System.out.println("Error: --> " + e.getMessage());
            e.getStackTrace();
            Usuarios user = new Usuarios();
        }
    }
}
