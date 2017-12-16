package com.javaguru.lesson12.generics;

public class PairTest {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 13);
        System.out.println(pair);
    }
}
