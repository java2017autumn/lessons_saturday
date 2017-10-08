package com.javaguru.lesson2;

import java.util.Scanner;

public class TernaryEvenOrOdd {

    public static void main(String[] args) {
        System.out.println("Hello, enter number: ");
        int userInput = getNumberFromUser();

        String result = isEven(userInput) ? "Even" : "Odd";

        System.out.println(result);
    }

    public static boolean isEven(int number) {
        int modResult = number % 2;
        boolean isEven = modResult == 0;
        return isEven;
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }
}
