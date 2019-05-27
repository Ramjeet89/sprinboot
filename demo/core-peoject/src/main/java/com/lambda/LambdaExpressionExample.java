package com.lambda;

@FunctionalInterface
interface MyInterface1<A, B> {
    A convertStringToIntegerMethod(B stringVal);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        MyInterface1<Integer, String> integerValue = (stringVal) -> Integer.valueOf(stringVal);
        Integer result = integerValue.convertStringToIntegerMethod("12");
        System.out.println("Integer:: " + result);
    }
}
