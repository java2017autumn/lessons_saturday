package com.javaguru.lesson8.light;

public class LightBulb {

    private boolean turnedOn;
    private String manufacturer;
    private int availableTurnOnCount = 5;

    LightBulb(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    LightBulb(String manufacturer, int availableTurnOnCount) {
        this.manufacturer = manufacturer;
        this.availableTurnOnCount = availableTurnOnCount;
    }

    public void turnOn() {
        if (availableTurnOnCount > 0 && !turnedOn) {
            turnedOn = true;
            availableTurnOnCount--;
            System.out.println("Light: ON");
        } else if (turnedOn) {
            System.out.println("Already turned on");
        } else {
            System.out.println("Burned out! :(");
        }
    }

    public void turnOff() {
        if (turnedOn) {
            turnedOn = false;
            System.out.println("Light: OFF");
        } else {
            System.out.println("Already turned off");
        }
    }

    @Override
    public String toString() {
        return "LightBulb{" +
                "turnedOn=" + turnedOn +
                ", manufacturer='" + manufacturer + '\'' +
                ", availableTurnOnCount=" + availableTurnOnCount +
                '}';
    }
}
