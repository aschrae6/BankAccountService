package com.monopolycapstone.services;

import com.monopolycapstone.models.Account;

import java.util.List;

public interface AccountService {

    public Account addAccount(Account account);
    public Account getAccount(int id);
    public List<Account> getAllAccounts();
    public Account updateAccount(Account change);
    public String deleteAccount(int id);

    public Account withdrawl(Account a);
    public Account deposit(Account a);

    public Account transfer(Account a);
}
