package customizados;

public class ContaCorrente {
    private String nome;
    private String email;
    private double saldo;

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

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (this.saldo < valor) {
            throw new SaldoException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }
}
