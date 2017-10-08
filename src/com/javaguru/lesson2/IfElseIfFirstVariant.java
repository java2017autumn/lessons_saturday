package com.javaguru.lesson2;


import java.util.Scanner;

public class IfElseIfFirstVariant {

    public static final int ZERO = 0;

    public static void main(String[] args) {
        System.out.println("Hello, please enter number");

        int userInput = getNumberFromUser();

        if (userInput == ZERO) {
            System.out.println("Zero");
        } else if (userInput > ZERO) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }
}
