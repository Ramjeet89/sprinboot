package com.interviewcoding;

public class ReverseNumberExample {
    public static void main(String[] args) {
        int originalNumber = 12345;
        System.out.println("OriginalString: " + originalNumber);
        System.out.println("Reverse Integer: " + reverseNumber(originalNumber));
    }

    public static int reverseNumber(int number) {
        int reverse = 0;
        int reminder;
        while (number != 0) {
            reminder = number % 10;
            number = number / 10;
            reverse = reverse * 10 + reminder;
        }
        return reverse;
    }
}
