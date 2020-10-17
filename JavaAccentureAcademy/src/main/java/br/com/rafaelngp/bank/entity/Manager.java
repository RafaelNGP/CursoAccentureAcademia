package br.com.rafaelngp.bank.entity;

public class Manager extends Employee {
    private String password;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public double getBonus() {
        return this.getSalary() * 0.15;
    }
}
