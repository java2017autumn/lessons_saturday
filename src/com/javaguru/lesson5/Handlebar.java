package com.javaguru.lesson5;


public class Handlebar {

    String color;
    double pointerRadius;
    double capacity;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPointerRadius() {
        return pointerRadius;
    }

    public void setPointerRadius(double pointerRadius) {
        this.pointerRadius = pointerRadius;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void decreaseCapacity(){
        capacity--;
    }

    @Override
    public String toString() {
        return "Handlebar{" +
                "color='" + color + '\'' +
                ", pointerRadius=" + pointerRadius +
                ", capacity=" + capacity +
                '}';
    }
}
