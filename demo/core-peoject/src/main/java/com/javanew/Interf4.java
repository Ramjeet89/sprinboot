package com.javanew;

public interface Interf4 {
    public void m1();
}

class Test2{
    int x=  777;
    public void m2(){
        Interf4 i=()->{
            int x =888;
            System.out.println(x);
            System.out.println(this.x);
        };
        i.m1();
    }

    public static void main(String[] args) {
        Test2 t  = new Test2();
        t.m2();
    }
}