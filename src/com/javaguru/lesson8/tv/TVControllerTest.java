package com.javaguru.lesson8.tv;

public class TVControllerTest {

    public static void main(String[] args) {
        TV tv = new TV();
        TVController tvController = new TVController(tv);
        tvController.onOff();

        tvController.increaseVolume();
        tvController.nextChannel();

        tvController.onOff();
        tvController.onOff();

        tvController.nextChannel();
    }
}
