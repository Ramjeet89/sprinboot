package com.strings;

public class StringIsPalindrom {

    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("Hello"));
    }
}

