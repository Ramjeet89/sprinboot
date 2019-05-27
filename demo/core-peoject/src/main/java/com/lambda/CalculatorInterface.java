package com.lambda;

@FunctionalInterface
public interface CalculatorInterface<A> {
    A submitMethod(A val1, A valu2);

}

class LambdaExpression_FunctionalInterface_calculatorSum {
    public static void main(String[] args) {
        CalculatorInterface<Integer> sum = (val1, val2) -> val1 + val2;

        //call method
        Integer result = sum.submitMethod(2, 3);
        System.out.println(result);
    }
}