package com.javaguru.lesson8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamListExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        while (true) {
            String userInput = getStringFromUser();
            if (userInput.equals("")) {
                break;
            }
            strings.add(userInput);
        }

        //Optional
        Set<String> uniqueStrings = strings.stream()
                .filter(s -> s.length() > 3)
                .sorted((o1, o2) -> o2.compareTo(o1))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toSet());

        uniqueStrings.forEach(System.out::println);
    }

    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
