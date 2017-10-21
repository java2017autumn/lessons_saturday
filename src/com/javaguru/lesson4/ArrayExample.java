package com.javaguru.lesson4;

import java.util.Random;

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = createArray(10);
        fillArrayWithRandomNumbers(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    public static int[] createArray(int length) {
        return new int[length];
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber();
        }
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }

}
