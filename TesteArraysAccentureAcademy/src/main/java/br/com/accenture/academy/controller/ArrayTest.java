package br.com.accenture.academy.controller;

import br.com.accenture.academy.entity.Account;
import br.com.accenture.academy.entity.CheckingAccount;
import br.com.accenture.academy.entity.SavingAccount;

public class ArrayTest {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];

        for (int i = 0; i < accounts.length; i++) {
            if (i % 2 == 0){
                accounts[i] = new CheckingAccount();
                accounts[i].setAmount(500 * i);
                accounts[i].setName(i + " Par");
            } else {
                accounts[i] = new SavingAccount();
                accounts[i].setAmount(500 * i);
                accounts[i].setName(i + " impar");
            }
            System.out.println(accounts[i]);
        }

        double media = 0;
        for (Account account : accounts) {
            media += account.getAmount();
        }
        System.out.println(media/accounts.length);

    }
}
