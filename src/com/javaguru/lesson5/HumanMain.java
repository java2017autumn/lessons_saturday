package com.javaguru.lesson5;


import java.util.Scanner;

public class HumanMain {

    public static void main(String[] args) {
        String name = getStringFromUser();

        Human human = new Human();
        human.setName(name);
        human.setAge(15);

        human.sayHello();
    }

    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
