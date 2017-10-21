package com.javaguru.lesson4;

public class RecursionExample {

    public static void main(String[] args) {
        sum(4);
        double firstNumber = 1.000001;
        double secondNumber = 0.000001;
        System.out.println(firstNumber - secondNumber);
    }

    public static int sum(int number) {
        int sum = number + number;
        if (sum == 128) {
            return sum;
        }
        return sum(sum);
    }
}
