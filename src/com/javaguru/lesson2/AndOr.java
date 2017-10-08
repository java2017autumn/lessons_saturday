package com.javaguru.lesson2;

import java.util.Scanner;

public class AndOr {

    public static void main(String[] args) {
        System.out.println("Hello, enter number: ");

        int userInput = getNumberFromUser();

        if (userInput >= 5000 && userInput < 10000) {
            System.out.println("Normal salary");
        } else if (userInput > 0 && userInput <= 4999) {
            System.out.println("Work more");
        } else if (userInput == 0 || userInput < 0) {
            System.out.println("sad");
        }
    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }
}
