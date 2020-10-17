package br.com.rafaelngp.bank.entity;

public class CheckingAccount extends Account{
   public String Type = super.Type = "Checking Account";

   public String getType() {
      return this.Type;
   }
}