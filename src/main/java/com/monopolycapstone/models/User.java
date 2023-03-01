package com.monopolycapstone.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    private int id;
    private String name;
    private String email;
    private  int userType;

    private UserAccount userAccount;

}
