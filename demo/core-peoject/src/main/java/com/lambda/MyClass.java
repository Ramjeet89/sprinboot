package com.lambda;
interface Interface1{
    default void myMethod(){
        System.out.println("Method1()");
    }
}

interface Integrface2{
    default void myMethod(){
        System.out.println("Method()");
    }
}

public class MyClass implements Interface1,Integrface2{
    @Override
    public void myMethod() {
        System.out.println(">>>>>>>>>");
    }
}
