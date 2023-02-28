package com.monopolycapstone.models;

import javax.persistence.*;

@Entity
@Table(name = "users_accounts")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    private int accNum;

    public UserAccount() {
    }

    public UserAccount(int id, int accNum) {
        this.id = id;
        this.accNum = accNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "id=" + id +
                ", accNum=" + accNum +
                '}';
    }
}
