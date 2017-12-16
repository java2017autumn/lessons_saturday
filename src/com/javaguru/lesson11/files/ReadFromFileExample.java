package com.javaguru.lesson11.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileExample {

    private static final String FILE_PATH = "src/com/javaguru/lesson11/files/database.txt";

    public static void main(String[] args) {
        File file = new File(FILE_PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
