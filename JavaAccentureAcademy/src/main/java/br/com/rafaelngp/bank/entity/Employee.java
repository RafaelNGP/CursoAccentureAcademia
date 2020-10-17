package br.com.rafaelngp.bank.entity;

public abstract class Employee {
    private String name;
    private String socialID;
    private double salary;

    public abstract double getBonus();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialID() {
        return socialID;
    }

    public void setSocialID(String socialID) {
        this.socialID = socialID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", socialID='" + socialID + '\'' +
                ", salary=" + salary +
                '}';
    }
}
