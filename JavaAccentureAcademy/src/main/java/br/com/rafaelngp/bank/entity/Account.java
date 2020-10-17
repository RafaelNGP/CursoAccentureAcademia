package br.com.rafaelngp.bank.entity;

import java.util.Random;

public abstract class Account {

    private final int NUMBER;
    private double amount;
    private String name;
    double accountIncome = 0.7;
    public String Type;

    public Account() {
        Random random = new Random();
        this.NUMBER = random.nextInt(99999999);
    }

    public void deposit(double depositAmount) {
        this.amount += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if (this.amount > withdrawAmount) {
            if (this.getType().equals("Checking Account") || this.getType().equals("Mixed Account")) {
                this.amount -= withdrawAmount;
                System.out.printf("Foram retirados: %.2f \n", withdrawAmount + 0.10);
            } else {
                System.out.printf("Foram retirados: %.2f \n", withdrawAmount);
                this.amount -= withdrawAmount;
            }
        } else
            System.out.println("Saldo insuficiente");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountNumber() {
        return this.NUMBER;
    }

    public double getAmount() {
        return amount;
    }

    public double getAccountIncome() {
        return amount * accountIncome;
    }

    @Override
    public String toString() {
        return "Account{" +
                "NUMBER=" + NUMBER +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                ", accountIncome=" + accountIncome +
                ", Type='" + Type + '\'' +
                '}';
    }

    public abstract String getType();

    public void transfer(Account destinyAccount, double transferAmount){
//        Remover dinheiro DESTA conta, e adicionar o dinheiro para a CONTA DESTINO.
        if (this.amount > transferAmount) {
            if (this.getType().equals("Checking Account")) {
                this.amount -= transferAmount;
                destinyAccount.deposit(transferAmount + 0.10);
                System.out.printf("Foram transferidos: %.2f \n", transferAmount);
            } else {
                destinyAccount.deposit(transferAmount);
                System.out.printf("Foram retirados: %.2f \n", transferAmount);
                this.amount -= transferAmount;
            }
        } else
            System.out.println("Saldo insuficiente");
    }
}
