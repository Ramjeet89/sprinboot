package com.interfaces;

interface MyInterface1 {
    void m();
}

interface MyInterface2 {
    void m();
}

public class MyClass1 implements MyInterface1, MyInterface2 {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.m();
        //obj.n();
    }

    @Override
    public void m() {
        System.out.println("m()");
    }

  /*  @Override
    public void n() {
        System.out.println("n()");
    }*/
}



