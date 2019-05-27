package com.oops1;

public class SuperClass {

    public void sum(int x,int y){
        System.out.println("Sum of 2 int type arguments"+(x+y));
    }
}

class SubClass extends SuperClass{
    public void sum(double x,double y){
        System.out.println("Som of 2 double type arguments:"+(x+y));
    }
}

class MyClasss{
    public static void main(String[] args) {
        SubClass obj  = new SubClass();
        obj.sum(2,5);
        obj.sum(2.5,3.5);
        MyClasss.main();
    }

    public static void main() {
        System.out.println("Main()");
    }
}
