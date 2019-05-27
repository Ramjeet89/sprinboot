//Write a predicate to check whether the given integer is greater than 10 or not.

package com.predicate;
import java.util.function.Predicate;

public class Test1 {
    public static void main(String[] args) {
        Predicate<Integer> p=I->(I>10);
        System.out.println(p.test(100));
        System.out.println(p.test(7));
        //System.out.println(p.test(true));
    }
}
