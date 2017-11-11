package com.javaguru.lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> uniqueWordsWithCount = new HashMap<>();
        while (true) {
            String userInput = getStringFromUser();
            if (userInput.equals("")) {
                break;
            }

            if (uniqueWordsWithCount.containsKey(userInput)) {
                Integer count = uniqueWordsWithCount.get(userInput);
                count++;
                uniqueWordsWithCount.put(userInput, count);
            } else {
                uniqueWordsWithCount.put(userInput, 1);
            }
        }

        for (String word : uniqueWordsWithCount.keySet()) {
            System.out.println("Key: " + word);
            System.out.println("Value: " + uniqueWordsWithCount.get(word));
        }

        for (Map.Entry<String, Integer> entry : uniqueWordsWithCount.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }

    public static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
