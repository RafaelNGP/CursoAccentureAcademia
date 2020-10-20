package br.com.rafaelngp.bank.entity;

public class CheckingAccount extends Account implements Taxable {
    public CheckingAccount() {
        setType();
    }

    @Override
    public void setType() {
        this.Type = "Checking Account";
    }

    @Override
    public double getTaxes() {
        LifeInsurance lifeInsurance = new LifeInsurance(this);
        return lifeInsurance.getValue();
    }

    @Override
    public String toString() {
        return "Account{" +
                "NUMBER=" + this.getAccountNumber() +
                ", amount=" + this.getAmount() +
                ", name='" + this.getName() + '\'' +
                ", accountIncome=" + this.getAccountIncome() +
                ", Type='" + this.getType() + '\'' +
                ", Taxes='" + this.getTaxes() + '\'' +
                "}";
    }

}