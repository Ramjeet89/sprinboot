package com.interfaces;

public interface Animals1 {
     static void food(){
        System.out.println("Static method");
    }
}
class MyClaseee implements Animals1{

   public void food(){
       System.out.println("Static method");
   }
}
