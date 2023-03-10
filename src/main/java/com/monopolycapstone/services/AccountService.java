package com.monopolycapstone.services;

import com.monopolycapstone.models.Account;

import java.util.List;

public interface AccountService {

    public Account addAccount(Account account);
    public Account getAccount(int id);
    public List<Account> getAllAccounts();
    public Account updateAccount(Account change);
    public String deleteAccount(int id);

    public double withdrawal(int id, int amount);
    public double deposit(int id, int amount);


    public Account transfer(Account a);
}
