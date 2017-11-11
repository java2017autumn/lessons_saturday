package com.javaguru.lesson7;

public class Bird implements Comparable<Bird> {

    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;

        Bird bird = (Bird) o;

        if (age != bird.age) return false;
        return name != null ? name.equals(bird.name) : bird.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Bird o) {
        return o.getName().compareTo(name);
//        return Integer.compare(o.getAge(), age);
    }
}

