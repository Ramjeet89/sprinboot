package com.interviewcoding;

public class ReverseStringUsingStringBufferExample {
    public static void main(String[] args) {
        String originalString = "abcde";
        StringBuffer bf  = new StringBuffer(originalString);
        System.out.println("Original String: "+originalString);
        System.out.println("Reverse String: "+bf.reverse());
    }
}
