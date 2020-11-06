package rollbar;

import com.rollbar.notifier.Rollbar;
import com.rollbar.notifier.config.Config;
import com.rollbar.notifier.config.ConfigBuilder;

public class App {

    private final Rollbar rollbar;

    public App() {
        Config config = ConfigBuilder.withAccessToken("61c82eec5dec4371bbf8a23425888bb2")
                .environment("Desenvolvimento")
                .codeVersion("1.0")
                .build();

        this.rollbar = Rollbar.init(config);
    }

    public static void main(String[] args) {
        App app = new App();
        try {
            app.registroErros();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void registroErros() throws Exception {
        try {
            throw new NumberFormatException("O formato nao pode ser convertido para numeros.");
        } catch (NumberFormatException e) {
            rollbar.error(e, "erro de conversao");
        } finally {
            rollbar.close(true);
            System.out.println("Registro criado se tudo deu certo!");
        }
    }
}
