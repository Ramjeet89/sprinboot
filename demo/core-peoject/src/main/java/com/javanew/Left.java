package com.javanew;

public interface Left {
    default void m1() {
        System.out.println("LEft Default m1() method");
    }
}
interface Right {
    default void m1() {
        System.out.println("Right Default m1() method");
    }
}
class Test5 implements Left, Right {
    @Override
    public void m1() {
        System.out.println("Test class Method");
        Left.super.m1();
    }
    public static void main(String[] args) {
        Test5 t = new Test5();
        t.m1();

    }
}