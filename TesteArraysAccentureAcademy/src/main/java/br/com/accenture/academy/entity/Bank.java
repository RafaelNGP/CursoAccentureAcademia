package br.com.accenture.academy.entity;

import java.util.Random;

public class Bank {
    String name;
    int accNumber;

    public Bank(String name) {
        Random random = new Random();
        this.accNumber = random.nextInt(999);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNumber() {
        return accNumber;
    }
}
