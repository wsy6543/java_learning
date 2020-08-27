package com.lagou.model02.work;

public class PhoneCard {

    private CardType type;
    private int number;
    private String name;
    private String password;
    private int balance;
    private int flow;
    private int duration;

    public PhoneCard(CardType type, int number, String name, String password, int balance, int flow, int duration) {
        this.type = type;
        this.number = number;
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.flow = flow;
        this.duration = duration;
    }

    public PhoneCard(){}

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void show(){
        System.out.println("my phone " + this.getNumber() + " my name " + this.getName() + " my balance " + this.getBalance());
    }
}
