package com.interviewcoding;

public class FibonacciSeriesExampleInJava {
    public static void main(String[] args) {
        int n = 10;
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        int first = 0;
        int second = 1;
        int temp;
        System.out.println(first);
        System.out.println(second);
        for (int i = 0; i < n; i++) {
            temp = first + second;
            first = second;
            second = temp;
            System.out.println(temp + " ");
        }
    }
}
