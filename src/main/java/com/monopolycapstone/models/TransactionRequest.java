package com.monopolycapstone.models;

public class TransactionRequest {

    private String type;
    private int amount;

    public TransactionRequest() {
    }

    public TransactionRequest(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionRequest{" +
                "command='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}
