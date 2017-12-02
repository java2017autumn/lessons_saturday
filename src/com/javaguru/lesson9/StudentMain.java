package com.javaguru.lesson9;

public class StudentMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.study();

        System.out.println();

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.writeCode();
        juniorDeveloper.study();
        juniorDeveloper.askQuestion();

        System.out.println();

        MiddleDeveloper developer = new MiddleDeveloper();
        developer.writeCode();
        developer.debugCode();

        System.out.println();

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper();
        seniorDeveloper.solveProblems();
        seniorDeveloper.askQuestion();
        seniorDeveloper.study();
    }
}
