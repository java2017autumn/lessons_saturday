package com.javaguru.lesson8.light;

public class LightTest {

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb("Philips");

        for (int i = 0; i < 10; i++) {
            lightBulb.turnOn();
            lightBulb.turnOff();
        }
    }
}
