package com.javaguru.lesson4;


import java.util.Random;

public class NumberUtils {

    public static int getRandomNumber(){
        Random random = new Random();
        return random.nextInt(101);
    }

    public static int getRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }
}
