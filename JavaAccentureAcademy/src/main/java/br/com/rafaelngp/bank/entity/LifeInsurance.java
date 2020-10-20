package br.com.rafaelngp.bank.entity;

import java.util.Random;

public class LifeInsurance {
    double value;
    Account owner;
    int insuranceNumber;
    String Type;

    public LifeInsurance(Account owner) {
        this.owner = owner;
        this.Type = "Standard";
        setValue(owner);
        Random random = new Random();
        this.insuranceNumber = random.nextInt(999);
    }

    public double getValue() {
        return value;
    }
    public void setValue(Account owner) {
        switch (owner.getType()) {
            case "Checking Account" -> this.value = (owner.getAmount() * 0.02 + 42);
            case "Mixed Account" -> this.value = (owner.getAmount() * 0.01 + 42);
        }
    }

    public Account getOwner() {
        return owner;
    }

    public int getInsuranceNumber() {
        return insuranceNumber;
    }

    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "LifeInsurance{" +
                "value=" + value +
                ", owner=" + owner.getName() +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
