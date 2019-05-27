package com.javanew;

interface Interf1 {
    public void methodOne();
}

class Test {
    public static void main(String[] args) {
        Interf1 i = () -> System.out.println("methodOne Execution");
        i.methodOne();
    }
}
