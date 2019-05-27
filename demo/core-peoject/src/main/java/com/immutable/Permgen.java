package com.immutable;

public class Permgen {
    public  long addIncremental(long l){
        Long  sum =0L;
        sum = sum+l;
        return sum;
    }

    public static void main(String[] args) {
        Permgen p = new Permgen();
        for (int i =0;i<1000;i++){
            p.addIncremental(i);
            System.out.println(p.addIncremental(i));
        }
    }
}
