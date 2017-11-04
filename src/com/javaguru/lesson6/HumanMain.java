package com.javaguru.lesson6;


public class HumanMain {

    public static void main(String[] args) {
        Human firstHuman = new Human("Vasya" , 15);
        System.out.println(firstHuman);

        Human secondHuman = new Human("Dima", 20);
        System.out.println(secondHuman);
        System.out.println(firstHuman);
    }
}
