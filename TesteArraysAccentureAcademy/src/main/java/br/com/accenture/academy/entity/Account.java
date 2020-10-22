package br.com.accenture.academy.entity;

public abstract class Account {
    String name;
    String type;
    double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public abstract void setType();

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}
