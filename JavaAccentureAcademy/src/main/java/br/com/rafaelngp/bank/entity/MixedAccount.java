package br.com.rafaelngp.bank.entity;

public class MixedAccount extends Account implements Taxable {
    public MixedAccount() {
        setType();
    }

    @Override
    public void setType() {
        this.Type = "Mixed Account";
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
