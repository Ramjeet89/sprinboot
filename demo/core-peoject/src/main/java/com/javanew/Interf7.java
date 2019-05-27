package com.javanew;

public interface Interf7 {
    public static void sum(int a,int b){
        System.out.println("Sum of::"+(a+b));
    }
    class Test5 implements Interf7{
        public static void main(String[] args) {
            //Test5  t  = new Test5();
            Interf7.sum(12,5);

        }
    }
}
