package com.javaguru.lesson8.light;

public class Switcher {

    private LightBulb lightBulb;
    private boolean turnedOn;

    public Switcher(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public Switcher() {

    }

    public void connect(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void onOff() {
        if (turnedOn) {
            turnedOn = false;
            lightBulb.turnOff();
        } else {
            turnedOn = true;
            lightBulb.turnOn();
        }
    }
}
