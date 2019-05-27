package com.function;

public class Test3 {
    public static void m1() {
        System.out.println("Child Thread");
    }

    public static void main(String[] args) {
        Runnable r = Test3::m1;
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
