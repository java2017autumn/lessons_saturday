package com.javaguru.lesson12.database;

import com.javaguru.lesson12.domain.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserDatabase {

    private static final String FILE_PATH = "src/com/javaguru/lesson12/database/user.txt";

    public void save(User user) {
        File file = new File(FILE_PATH);
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(user.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("User successfully saved");
    }
}
