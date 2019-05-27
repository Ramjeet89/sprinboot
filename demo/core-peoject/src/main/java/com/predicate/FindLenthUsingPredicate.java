package com.predicate;

import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class FindLenthUsingPredicate {
    public static void main(String[] args) {
        Predicate<String> p1  =s->(s.length()>3);
        System.out.println(p1.test("Ramjeet"));
        System.out.println(p1.test("om"));

        Predicate<Collection>p2=c->c.isEmpty();
        System.out.println(p2);

    }
}
