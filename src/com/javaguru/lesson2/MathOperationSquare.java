package com.javaguru.lesson2;

import java.util.Scanner;

public class MathOperationSquare {

    public static void main(String[] args) {
        printGreeting();
        int userInput = getNumberFromUser();
        int secondUserInput = getNumberFromUser();

        int squareResult = square(userInput);
        printResult(squareResult);

        squareResult = square(secondUserInput);
        printResult(squareResult);
    }

    public static void printGreeting() {
        System.out.println("Hello, please enter number: ");
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static int square(int number) {
        return number * number;
    }

    public static void printResult(int result) {
        System.out.println("Result: " + result);
    }
}
