//package com.monopolycapstone.models;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "users")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "u_id")
//    private int id;
//
//    private String name;
//    private String email;
//    private  int userType;
//
//    @ElementCollection
//    private List<Account> accounts;
//
//    public User() {
//    }
//
//    public User(int id, String name, String email, int userType) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.userType = userType;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getUserType() {
//        return userType;
//    }
//
//    public List<Account> getAccounts() {
//        return accounts;
//    }
//
//    public void setAccounts(List<Account> accounts) {
//        this.accounts = accounts;
//    }
//
//    public void setUserType(int userType) {
//        this.userType = userType;
//    }
//
//
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", userType=" + userType +
//                '}';
//    }
//}
