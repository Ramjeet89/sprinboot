package com.oops1;

public class MyClass implements MyInterface1 ,MyInterface2{
    @Override
    public void m() {
        System.out.println("m1");
    }

    @Override
    public void n() {
        System.out.println("m2");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.m();
        obj.n();
    }
}
