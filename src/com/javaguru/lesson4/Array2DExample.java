package com.javaguru.lesson4;

import java.util.Random;

public class Array2DExample {

    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandomNumber();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }
}
