package com.javaguru.lesson4;

public class StringArray {

    public static void main(String[] args) {
        String helloWorld = "Hello World!";
        String[] strings = helloWorld.split(" ");
        for (String word : strings) {
            System.out.println(word);
        }
    }
}
