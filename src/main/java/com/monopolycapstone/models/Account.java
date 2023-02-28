package com.monopolycapstone.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "a_num")
private int id;

private int account;
@Column(columnDefinition = "NUMERIC(10,2)")
private int balance;


    public Account() {
    }

    public Account(int id, int account, int balance) {
        this.id = id;
        this.account = account;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account=" + account +
                ", balance=" + balance +
                '}';
    }
}
