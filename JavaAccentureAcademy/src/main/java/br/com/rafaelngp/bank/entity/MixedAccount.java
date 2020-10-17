package br.com.rafaelngp.bank.entity;

public class MixedAccount extends Account {
    public String Type = super.Type = "Mixed Account";

    public String getType() {
        return this.Type;
    }
}
