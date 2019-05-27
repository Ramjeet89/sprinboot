package com.lambda;

interface MyInterface {
    void m();
}

public class InnerClassInterfaceTest {

    public static void main(String[] args) {
        new MyInterface() {
            public void m() {
                System.out.println("implementation of MyInterface's m() method");
            }

           public void run(){

           }
        }.m();


    }
}
