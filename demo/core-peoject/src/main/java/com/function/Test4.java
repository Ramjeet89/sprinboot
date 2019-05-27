package com.function;

public class Test4 {

    public  void m2(int i){
        System.out.println("From Method Refrence"+i);
    }
    public static void main(String[] args) {
        Interf f  = i->System.out.println("From Lambda Expression"+i);
        f.m1(10);
        Test4 t = new Test4();
        Interf i1 =t::m2;
        i1.m1(10);
    }
}
