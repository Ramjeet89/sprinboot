package com.lambda;

public class WithoutLambdaExpressionThreadExample {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Thread-1");
        }).start();
    }
}
