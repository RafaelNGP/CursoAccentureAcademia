package br.com.rafaelngp.bank.controller;

import br.com.rafaelngp.bank.entity.*;

public class RflBank {
    public static void main(String[] args) {
        CheckingAccount acc1 = new CheckingAccount();
        acc1.setName("Rafael");
        acc1.deposit(500);

        SavingsAccount acc2 = new SavingsAccount();
        acc2.setName("Laura");
        acc2.deposit(500);

        MixedAccount acc3 = new MixedAccount();
        acc3.setName("Simone");
        acc3.deposit(500);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }
}
