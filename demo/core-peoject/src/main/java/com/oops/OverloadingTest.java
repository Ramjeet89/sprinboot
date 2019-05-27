package com.oops;

public class OverloadingTest {

    public void m1(int i){
        System.out.println("int-arg method");
    }

    public void m1(float f){
        System.out.println("float-arg method");
    }

    public static void main(String[] args) {
        OverloadingTest t = new OverloadingTest();
        t.m1(10);
        t.m1(10.5f);
        t.m1('a');
        t.m1(10l);
       // t.m1(10.5); here method autometing promotion not possible it'll give compile time
    }
}
