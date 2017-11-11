package com.javaguru.lesson7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        long start = System.currentTimeMillis();
        fillList(integers);
        long stop = System.currentTimeMillis();

        long result = stop - start;

        System.out.println("Size: " + integers.size());
        System.out.println(result + " ms");
    }

    public static void fillList(List<Integer> integers) {
        for (int i = 0; i < 1_000_00; i++) {
            integers.add(0, getRandomNumber());
        }
    }

    public static int getRandomNumber() {
        return new Random().nextInt();
    }
}
