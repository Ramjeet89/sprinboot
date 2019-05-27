package com.oops;

public class BankMainTest {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println("Rate of interast is " + b.getRateOfInterast() + " %");

        b = new HDFC();
        System.out.println("Rate of interast is " + b.getRateOfInterast() + " %");

        b = new ICICI();
        System.out.println("Rate of interast is " + b.getRateOfInterast() + " %");

    }
}
