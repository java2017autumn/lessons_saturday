package com.javaguru.lesson11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        int number = getNumberFromUser();
        System.out.println(number);
    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Try again");
            }
        }
    }
}
