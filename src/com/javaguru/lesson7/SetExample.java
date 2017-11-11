package com.javaguru.lesson7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> uniqueWords = new HashSet<>();
        while (true) {
            String userInput = getStringFromUser();
            if (userInput.equals("")) {
                break;
            }
            uniqueWords.add(userInput);
        }

        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    public static String getStringFromUser() {
        return new Scanner(System.in).nextLine();
    }
}
