package com.javaguru.lesson4;

public class ArrayUtils {

    public static int[] createArray(int length) {
        return new int[length];
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = NumberUtils.getRandomNumber();
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

}
