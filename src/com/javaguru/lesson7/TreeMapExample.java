package com.javaguru.lesson7;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<Bird, String> map = new TreeMap<>();

        map.put(new Bird("Eagle", 2), "Predator");
        map.put(new Bird("Chicken", 1), "Home pet");
        map.put(new Bird("Hawk", 3), "Predator");
        map.put(new Bird("Ostrich", 5), "Predator");
        map.put(new Bird("Penguin", 4), "Predator");

        for (Map.Entry<Bird, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
