package com.javaguru.lesson9.students;

import java.util.ArrayList;
import java.util.List;

class PolymorphismMain {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new JuniorDeveloper());
        students.add(new MiddleDeveloper());
        students.add(new SeniorDeveloper());

        students.forEach(Student::study);

        Student student = new SeniorDeveloper();
        student.study();
    }
}
