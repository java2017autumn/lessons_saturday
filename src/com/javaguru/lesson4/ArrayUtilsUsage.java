package com.javaguru.lesson4;

public class ArrayUtilsUsage {

    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(SIZE);
        ArrayUtils.fillArrayWithRandomNumbers(array);
        ArrayUtils.printArray(array);
    }
}
