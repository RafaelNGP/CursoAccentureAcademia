package primeirosErros;

public class App {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
//                int a = 2 / 0;
//                System.out.println(a);

                String nome = "Rafael";
                Integer.parseInt(nome);
            } catch (ArithmeticException e){
                System.out.println("Ocorreu um erro aritmetico: Mensagem --> " + e.getMessage());
//                e.printStackTrace();
            } catch (NumberFormatException e){
                System.out.println("Ocorreu um erro de conversao: Mensagem --> " + e.getMessage());
            }
        }
    }
}
