package com.oops;

public class Parent {

    public void m1(int...i){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    public void m1(int i){
        System.out.println("Child");
    }
}

class TestMain{
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1(10);

        Child c = new Child();
        c.m1(10);

        Parent p1  = new Child();
        p1.m1(10);

    }
}