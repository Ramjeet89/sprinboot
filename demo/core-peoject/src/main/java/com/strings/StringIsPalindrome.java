package com.strings;

public class StringIsPalindrome {

    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer.toString().equals(str);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("abcd"));
    }
}
