package com.javaguru.lesson5;

public class Pencil {

    double weight;
    String firmName;
    Handlebar handlebar;

    Pencil(Handlebar handlebar) {
        this.handlebar = handlebar;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public Handlebar getHandlebar() {
        return handlebar;
    }

    public void setHandlebar(Handlebar handlebar) {
        this.handlebar = handlebar;
    }

    public String getHandleBarColor() {
        return handlebar.getColor();
    }

    public void write(){
        System.out.println("Something...");
        handlebar.decreaseCapacity();
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "weight=" + weight +
                ", firmName='" + firmName + '\'' +
                ", handlebar=" + handlebar +
                '}';
    }
}
