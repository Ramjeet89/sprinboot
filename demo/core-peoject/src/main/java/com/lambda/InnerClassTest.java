package com.lambda;


class OuterClass {
    void m() {
        System.out.println("m()");
    }
}
public class InnerClassTest {
    public static void main(String[] args) {

      /*  OuterClass obj = new OuterClass() {
            void m() {
                System.out.println("overridden  m()");
            }
        };
        obj.m();
        */

      new OuterClass(){
      }.m();
    }
}
