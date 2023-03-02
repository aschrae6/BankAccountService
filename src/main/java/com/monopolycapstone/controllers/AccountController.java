package com.monopolycapstone.controllers;


import com.monopolycapstone.models.Account;
import com.monopolycapstone.models.TransactionRequest;
import com.monopolycapstone.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@PatchMapping("/{id}")
    public ResponseEntity<String> accountTransactions(@RequestBody TransactionRequest transactionRequest, @PathVariable int id){
    double newBalance = 0;
    try{
        String type = transactionType(transactionRequest.getType());
        if(type.equals("withdrawal")) {

            newBalance = as.withdrawal(id, transactionRequest.getAmount());
        } else if(type.equals("deposit")) {

            newBalance = as.deposit(id, transactionRequest.getAmount());
        }
    }catch (IllegalArgumentException e) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
        String message = ("You new account balance is: " + newBalance);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    private String transactionType(String request){
        if(request.equals("withdrawal")|| request.equals("deposit")) {
            return request;
        }else {
            throw new IllegalArgumentException();
        }
    }

//    public ResponseEntity<Account> accountTransfers(Command cmd, int id) {
//
//    }

}