package com.desafio.accenture.semana1.demo.controller;

import com.desafio.accenture.semana1.demo.entity.Account;
import com.desafio.accenture.semana1.demo.entity.CheckingAccount;
import com.desafio.accenture.semana1.demo.repository.Database;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.Hashtable;

@RestController
public class AccountController {
/*    @GetMapping("/ex1")
    public ResponseEntity<String> exStringOK() {
        return ResponseEntity.ok("Ok");
    }

    @GetMapping("/ex2")
    public ResponseEntity<String> exStringACCEPTED() {
        return ResponseEntity.accepted().body("Accepted");
    }

    @GetMapping("/ex3")
    public ResponseEntity<Account> extoStringOK() {
        Account conta1 = new CheckingAccount();
        conta1.setName("Rafael");
        conta1.setBalance(500);
        return ResponseEntity.accepted().body(conta1);
    }

    @GetMapping("/ex4")
    public ResponseEntity<Account> exObjACCEPTED() {
        SavingAccount conta2 = new SavingAccount();
        conta2.setName("Laura");
        conta2.setBalance(500);
        return ResponseEntity.accepted().body(conta2);
    }

    @GetMapping("/ex5/{name}")
    public ResponseEntity<Account> exObjOK(@PathVariable String name) {
        CheckingAccount conta1 = new CheckingAccount();
        conta1.setName(name);
        conta1.setBalance(500);
        return ResponseEntity.accepted().body(conta1);
    }*/

    Hashtable accountRepository = Database.INSTANCE.account();

    @GetMapping("/account")
    public ResponseEntity<ArrayList<Account>> getAllAccounts(){
        return ResponseEntity.ok(new ArrayList<Account>(accountRepository.values()));
    }

    @GetMapping("/account/{number}")
    public ResponseEntity<Account> exURI(@PathVariable String number){
        Account foundAccount = (Account) accountRepository.get(number);
        return ResponseEntity.ok(foundAccount);
    }

    @PostMapping("/account")
    public ResponseEntity<Account> AccountResponseEntity(@RequestBody CheckingAccount account){
        var saveduser = accountRepository.put(account.getNumber(), account);
        return ResponseEntity.created(URI.create("/account/" + saveduser)).body(account);
    }
}
