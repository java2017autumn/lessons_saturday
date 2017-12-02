package com.javaguru.lesson9.birds;

import java.util.ArrayList;
import java.util.List;

public class BirdMain {

    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Chicken());
        birds.add(new Owl());
        birds.add(new Bird() {
            @Override
            public void fly() {
                System.out.println("Noname(abstract) bird");
            }
        });

        birds.forEach(bird -> bird.fly());
    }
}
