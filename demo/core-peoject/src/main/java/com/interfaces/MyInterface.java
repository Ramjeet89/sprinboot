package com.interfaces;

public interface MyInterface {
    int i=2;
    void m1();
    void m2();
}

class MyClass implements MyInterface{
    public static void main(String[] args) {
        MyInterface obj  = new MyClass();
        obj.m1();
        obj.m2();
        System.out.println("MyInterfaces :: "+i);
    }

    @Override
    public void m1() {
        System.out.println("In m1()");
    }

    @Override
    public void m2() {
        System.out.println("In m2()");
    }
}
