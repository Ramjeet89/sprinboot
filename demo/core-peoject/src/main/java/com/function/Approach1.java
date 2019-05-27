package com.function;

import java.util.ArrayList;

public class Approach1 {
    public static void main(String[] args) {
        ArrayList<Integer> i1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            i1.add(i);
        }
        System.out.println(i1);
        ArrayList<Integer> i2 = new ArrayList<>();
        for (Integer i : i1) {
            if (i % 2 == 0) {
                i2.add(i);
            }
            System.out.println(i2);
        }
    }
}
