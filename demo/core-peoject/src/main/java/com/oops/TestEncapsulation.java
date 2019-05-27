package com.oops;

public class TestEncapsulation {
    public static void main(String[] args) {

        Account account = new Account();
        account.setAcc_No(123456789);
        account.setName("Ramjeet");
        account.setEmail("ramjeet.mahto@gmail.com");
        account.setAmount(3000.0f);

        System.out.println(account.toString());

    }
}
