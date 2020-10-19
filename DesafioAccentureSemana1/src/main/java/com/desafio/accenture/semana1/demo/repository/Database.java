package com.desafio.accenture.semana1.demo.repository;

import com.desafio.accenture.semana1.demo.entity.Account;

import java.util.Hashtable;

public enum Database {
    INSTANCE;

    private final Hashtable<String, Account> account;

    Database() {
        account = new Hashtable<>();
    }

    public Hashtable account() {
        return this.account;
    }
}
