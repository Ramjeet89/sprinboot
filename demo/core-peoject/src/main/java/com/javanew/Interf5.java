package com.javanew;

public interface Interf5 {
    public void m1();
}

class Test3 {
    int x = 10;

    public void m2() {
        int y = 20;
        Interf5 i = () -> {
            System.out.println(x);
           // System.out.println(y);
            x = 888;
            //y=999;
        };
        i.m1();
        y = 777;
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.m2();
    }
}
