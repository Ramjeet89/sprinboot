package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStringListExpressionExample {
    public static void main(String[] args) {
        String[] stringArray = {"ab", "ef", "cd"};
        List<String> stringList = Arrays.asList(stringArray);
        Collections.sort(stringList, String::compareTo);
        System.out.println(stringList);
    }
}
