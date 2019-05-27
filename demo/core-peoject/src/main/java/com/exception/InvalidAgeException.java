package com.exception;

import java.util.Scanner;

public class InvalidAgeException extends Exception {

    public InvalidAgeException(String mesage) {
        super(mesage);
    }
}

class TestMainException {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("Not valid");
            } else {
                System.out.println("Welcome to Vote");
            }
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}

