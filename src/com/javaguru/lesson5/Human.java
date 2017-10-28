package com.javaguru.lesson5;

public class Human {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello! My name is "
                + getName() + " , I'm " + getAge() + " old.");
    }
}
