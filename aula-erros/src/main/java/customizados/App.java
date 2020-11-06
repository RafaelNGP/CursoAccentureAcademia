package customizados;

public class App {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        conta1.setNome("Rafael");
        conta1.setEmail("rafaelferreira.dev3@gmail.com");

        conta1.depositar(100);

        try {
            conta1.sacar(110);
        } catch (SaldoException e){
            System.err.println(e.getMessage());
            System.out.println("Informe um valor valido.");
        }

        System.out.printf("Saldo atual da conta: %.2f", conta1.getSaldo());
    }
}
