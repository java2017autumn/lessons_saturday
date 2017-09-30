package com.javaguru.lesson1;

import java.util.Scanner;

public class MathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hello = "Hello!";
        String inputRequest = new String("Enter integer number: ");

        System.out.println(hello);
        System.out.println(inputRequest);

        int firstNumber = scanner.nextInt();

        System.out.println("User input = " + firstNumber);

        System.out.println(inputRequest);

        int secondNumber = scanner.nextInt();

        System.out.println("User input = " + secondNumber);

        int sumResult = firstNumber + secondNumber;
        int subtractResult = firstNumber - secondNumber;
        int multiplyResult = firstNumber * secondNumber;
        double divideResult = (double) secondNumber / firstNumber;

        System.out.println("Sum: " + sumResult);
        System.out.println("Subtract: " + subtractResult);
        System.out.println("Multiply: " + multiplyResult);
        System.out.println("Divide: " + divideResult);

    }
}
