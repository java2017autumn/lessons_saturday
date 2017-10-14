package com.javaguru.lesson3;

import java.util.Scanner;

public class PowExample {

    public static void main(String[] args) {
        System.out.println("Hello, enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter power: ");
        int power = scanner.nextInt();

        int result = pow(number, power);
        System.out.println(result);
    }

    public static int pow(int number, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = number * result;
        }
        return result;
    }
}
