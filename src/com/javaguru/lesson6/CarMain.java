package com.javaguru.lesson6;

public class CarMain {

    public static void main(String[] args) {
        Car firstCar = new Car("Red", "BMW");
        System.out.println(firstCar);

        Car secondCar = new Car("Red", "BMW");
        System.out.println(secondCar);

        System.out.println("Equals: " + firstCar.equals(secondCar));
    }
}
