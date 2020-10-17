package br.com.rafaelngp.bank.entity;

public class SavingsAccount extends Account{
    public String Type = super.Type = "Saving Account";

    public String getType() {
        return this.Type;
    }
}
