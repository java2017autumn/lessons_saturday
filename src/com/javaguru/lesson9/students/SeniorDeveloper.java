package com.javaguru.lesson9.students;

public class SeniorDeveloper extends MiddleDeveloper {

    @Override
    public void study() {
        System.out.println("Easy study");
    }

    public void solveProblems() {
        System.out.println("Easy");
    }

    @Override
    public void askQuestion() {
        System.out.println("Who am i ?");
    }
}
