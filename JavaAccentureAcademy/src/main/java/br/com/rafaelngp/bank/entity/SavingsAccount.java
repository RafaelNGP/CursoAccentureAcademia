package br.com.rafaelngp.bank.entity;

public class SavingsAccount extends Account{
    public SavingsAccount() {
        setType();
    }

    @Override
    public void setType() {
        this.Type = "Saving Account";
    }

    @Override
    public String toString() {
        return "Account{" +
                "NUMBER=" + this.getAccountNumber() +
                ", amount=" + this.getAmount() +
                ", name='" + this.getName() + '\'' +
                ", accountIncome=" + this.getAccountIncome() +
                ", Type='" + this.getType() + '\'' +
                "}";
    }
}
