package com.thread11;

public class Account {
    private int balance = 10000;

    public void deposit(int amount){
        balance+=amount;
    }

    public void widthdraw(int amount){
        balance-=amount;
    }

    public int getBalance() {
        return balance;
    }
    public static void transfer(Account acc1,Account acc2 ,int amount){
        acc1.deposit(amount);
        acc2.widthdraw(amount);
    }
}
