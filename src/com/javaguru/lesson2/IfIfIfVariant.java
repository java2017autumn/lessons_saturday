package com.javaguru.lesson2;


import java.util.Scanner;

public class IfIfIfVariant {

    public static void main(String[] args) {
        System.out.println("Hello, please enter number");

        int userInput = getNumberFromUser();

        if (userInput == 0) {
            System.out.println("ZERO");
            return;
        }

        if (userInput > 0) {
            System.out.println("Positive");
            return;
        }

        System.out.println("Negative");
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }
}
