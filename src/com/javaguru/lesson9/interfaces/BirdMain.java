package com.javaguru.lesson9.interfaces;

public class BirdMain {

    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Eagle eagle = new Eagle();
        Hawk hawk = new Hawk();

        tryToFly(hawk);
        tryToFly(eagle);

        tryToEat(chicken);
        tryToEat(eagle);
    }

    public static void tryToFly(Flyable flyable) {
        flyable.fly();
    }

    public static void tryToEat(Eatable eatable) {
        eatable.eat();
    }
}
