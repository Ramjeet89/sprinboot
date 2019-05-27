package com.lambda;

import java.util.Arrays;

public class SortStringArrayLambdaExpressionExample2 {
    public static void main(String[] args) {
        String[] stringArray ={"b","d","a","c"};
        System.out.println("In Java 8 - Sort StringArray using > Lambda expression");

       // Arrays.sort(stringArray,(a,b)-> a.compareTo(b));
        Arrays.sort(stringArray, String::compareTo);

        for (String  str:stringArray){
            System.out.println(str+" ");

        }
    }
}
