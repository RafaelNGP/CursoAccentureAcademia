package br.com.accenture.academy.entity;

public class CheckingAccount extends Account {

    public CheckingAccount() {
        setType();
    }

    @Override
    public void setType() {
        this.type = "Checking Account";
    }
}
