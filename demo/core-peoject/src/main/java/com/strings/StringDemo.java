package com.strings;

public class StringDemo {
    public static void main(String[] args) {

        String s1 = "JAVA";
        String s2 = new String("JAVA");
        String s3 = s2.intern();
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
    }
}
