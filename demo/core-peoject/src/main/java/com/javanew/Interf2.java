package com.javanew;

public interface Interf2 {
    public void sum(int a,int b);

    public static void main(String[] args) {
        Interf2 i=(a,b)->System.out.println("Sum of (a+b)::"+(a+b));
        i.sum(2,6);
    }
}
