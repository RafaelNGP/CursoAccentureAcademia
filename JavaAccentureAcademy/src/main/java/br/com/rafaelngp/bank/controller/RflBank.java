package br.com.rafaelngp.bank.controller;

import br.com.rafaelngp.bank.entity.CheckingAccount;
import br.com.rafaelngp.bank.entity.MixedAccount;
import br.com.rafaelngp.bank.entity.SavingsAccount;

public class RflBank {
    public static void main(String[] args) {
        CheckingAccount rafael = new CheckingAccount();
        rafael.setName("Rafael");

        SavingsAccount laura = new SavingsAccount();
        laura.setName("Laura");

        MixedAccount simone = new MixedAccount();
        simone.setName("Simone");

        rafael.deposit(250.00);
        rafael.withdraw(10.00);
        rafael.withdraw(10.00);
        rafael.withdraw(10.00);
        rafael.withdraw(10.00);
        rafael.withdraw(10.00);
        System.out.println(rafael);

        laura.deposit(600);
        System.out.println(laura);

        simone.deposit(8000);
        System.out.println(simone);

        rafael.transfer(laura, 100);
        System.out.println("Rafael: Ei Laura, passei pra voce o dinheiro da semana");
        System.out.println(rafael);
        System.out.println(laura);
    }
}
