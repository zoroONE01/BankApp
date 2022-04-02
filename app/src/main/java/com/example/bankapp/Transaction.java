package com.example.bankapp;

import java.util.Date;

public class Transaction {
    private String sender;
    private String reciever;
    private Date date;
    private float value;
    private boolean status;
    public static final Transaction[] transactionList = {new Transaction("Sacombank", "Aribank", 12312312, true), new Transaction("Sacombank", "Aribank", 12312312, true), new Transaction("Sacombank", "Aribank", 12312312, true), new Transaction("Sacombank", "Aribank", 12312312, true)};

    public Transaction(String sender, String reciever, float value, boolean status) {
        this.sender = sender;
        this.reciever = reciever;
        this.value = value;
        this.status = status;
    }

    public Transaction() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
