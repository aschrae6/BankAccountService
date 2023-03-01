package com.monopolycapstone.controllers;


import com.monopolycapstone.models.Account;
import com.monopolycapstone.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    AccountService as;

    @PostMapping
    public ResponseEntity<Account> addAccount(@RequestBody Account account) {
        if (account.getBalance() > 100) {
            account = as.addAccount(account);
            return ResponseEntity.ok(account);

        } else {
            return ResponseEntity.unprocessableEntity().body(account);
        }

    }

    @GetMapping
    public ResponseEntity<List<Account>> getAccounts() {
        List<Account> accounts = as.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccount(@PathVariable int id) {
        return ResponseEntity.ok(as.getAccount(id));

    }

    @PutMapping("/{id}")
    public ResponseEntity<Account> updateAccount(@RequestBody Account change, @PathVariable int id) {
        change.setAccountNum(id);
        as.updateAccount(change);
        return ResponseEntity.ok(change);
    }

    @DeleteMapping("/{id}")
    public String deleteAccount(@PathVariable int id) {
        return as.deleteAccount(id);
    }

}