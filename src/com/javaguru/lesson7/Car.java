package com.javaguru.lesson7;

public class Car {

    private String color;
    private String mark;

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

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (mark != null ? mark.hashCode() : 0);
        return result;
    }
}
