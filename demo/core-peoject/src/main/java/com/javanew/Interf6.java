package com.javanew;

public interface Interf6 {
    default void m1() {
        System.out.println("Default method...!!");
    }
  /*  default int hashCode(){
        return 10;
    }*/
}
class Test4 implements Interf6 {
    public static void main(String[] args) {
        Test4 t = new Test4();
        t.m1();
    }
}
