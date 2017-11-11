package com.javaguru.lesson7;

import java.util.HashMap;
import java.util.Map;

public class CarMapMain {

    public static void main(String[] args) {
        Map<Car, String> map = new HashMap<>();
        map.put(new Car("Red", "BMW"), "WooW BMW!");
        map.put(new Car("Black", "Volvo"), "WooW Volvo");

        Car key = new Car("Red", "BMW");

        System.out.println(map.get(key));
    }
}
