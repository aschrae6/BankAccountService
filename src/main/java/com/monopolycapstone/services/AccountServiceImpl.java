package com.monopolycapstone.services;

import com.monopolycapstone.models.Account;
import com.monopolycapstone.repositories.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepo ar;

    @Override
    public Account addAccount(Account account) {
        return ar.save(account);
    }

    @Override
    public Account getAccount(int id) {

        return ar.findById(id).get();
    }

    @Override
    public List<Account> getAllAccounts() {
        return ar.findAll();
    }

    @Override
    public Account updateAccount(Account change) {
        return ar.save(change);
    }

    @Override
    public String deleteAccount(int id) {
        ar.deleteById(id);
        return "Account Deleted Successfully";
    }
}