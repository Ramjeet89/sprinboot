package com.lambda;

@FunctionalInterface
interface CalculatorInterface1<A> {
    A squareMethod(A val);
}

public class LambdaExpression_FunctionalInterface_calculatorSquare {
    public static void main(String[] args) {
        CalculatorInterface1<Integer> square = (val) -> (val * val);

        Integer result = square.squareMethod(5);
        System.out.println(result);
    }
}
