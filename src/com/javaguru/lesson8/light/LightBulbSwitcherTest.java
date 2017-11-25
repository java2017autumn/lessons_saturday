package com.javaguru.lesson8.light;

public class LightBulbSwitcherTest {

    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb("Philips", 2);
        Switcher switcher = new Switcher();

        switcher.connect(lightBulb);

        for (int i = 0; i < 10; i++) {
            switcher.onOff();
        }
    }
}
