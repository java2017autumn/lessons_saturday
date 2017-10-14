package com.javaguru.lesson3;

import java.util.Scanner;

public class EnterSecretKeyToExit {

    public static void main(String[] args) {
        String secretKey = "password123";
        while (true) {
            System.out.println("Enter secret key: ");
            String userInput = getStringFromUser();
            if (isCorrectSecretKey(secretKey, userInput)) {
                System.out.println("Success!");
                break;
            }
        }
    }

    public static boolean isCorrectSecretKey(String secretKey, String userInput) {
        return secretKey.equals(userInput);
    }

    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
