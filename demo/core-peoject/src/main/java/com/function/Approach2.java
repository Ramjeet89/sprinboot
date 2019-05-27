package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Approach2 {
    public static void main(String[] args) {
        ArrayList<Integer> i1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            i1.add(i);
        }
        System.out.println(i1);
        List<Integer> i2 = i1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(i2);

    }
}
