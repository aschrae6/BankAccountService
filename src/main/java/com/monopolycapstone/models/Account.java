package com.monopolycapstone.models;

import javax.persistence.*;
import java.util.List;


@Table(name = "accounts")
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_num")
    private int accountNum;
    @Column(name = "a_type")
    private AccountType accountType;
    @Column(name = "balance", columnDefinition = "NUMERIC(10,2)")
    private double balance;


    public Account() {
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNum=" + accountNum +
                ", accountType=" + accountType +
                ", balance=" + balance +
                '}';
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Account(int accountNum, AccountType accountType, double balance) {
        this.accountNum = accountNum;
        this.accountType = accountType;
        this.balance = balance;
    }
}