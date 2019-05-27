package com.javanew;

public class Test1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
           for (int i=0;i<10;i++){
               System.out.println("Child Thread");
           }
        });
        t1.start();
        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
