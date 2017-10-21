package com.javaguru.lesson4;

import java.util.Random;

public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[10];

    }

    public static int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(101);
    }

}
