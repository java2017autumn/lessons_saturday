package com.javaguru.lesson9.interfaces;

public class Eagle implements Flyable,Eatable {

    @Override
    public void fly() {
        System.out.println("Flying predator");
    }

    @Override
    public void eat() {
        System.out.println("I'ts a eagle!!??!!?");
    }
}
