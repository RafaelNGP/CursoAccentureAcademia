package objetos;

public class App {
    public static void main(String[] args) {
        try {
            Usuario usuario = null;
            usuario.setNome("user teste");
            usuario.setEmail("emailteste@teste.com");
        } catch (NullPointerException e){
            System.out.println("Erro famoso de null: --> " + e.getMessage());
            e.getStackTrace();
            Usuario usuario = new Usuario();
        }
    }
}

class Usuario {
    String nome;
    String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
