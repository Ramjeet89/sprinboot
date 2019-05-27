package com.javanew;

public interface Interf3 {
    public int sqrt(int x);

    class Test{
        public static void main(String[] args) {
            Interf3 i=x->x*x;
            System.out.println("The Sqrt Value:: "+i.sqrt(5));
        }
    }
}
