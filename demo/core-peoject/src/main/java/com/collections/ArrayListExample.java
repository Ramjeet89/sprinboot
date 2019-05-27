package com.collections;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(20);
        l.add("Java Code");
        l.add("ArrayList Implementation in java");
        System.out.println(l);

        l.add(2,"30");
        System.out.println(l);
    }
}
