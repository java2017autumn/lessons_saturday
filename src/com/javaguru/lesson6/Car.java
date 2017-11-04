package com.javaguru.lesson6;

public class Car {

    String color;
    String mark;

    public Car(String color, String mark) {
        this.color = color;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (color != null ? !color.equals(car.color) : car.color != null) return false;
        return mark != null ? mark.equals(car.mark) : car.mark == null;
    }
}
