package br.com.accenture.academy.entity;

public class SavingAccount extends Account {

    public SavingAccount() {
        setType();
    }

    @Override
    public void setType() {
        this.type = "Saving Account";
    }
}
