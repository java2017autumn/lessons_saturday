package com.javaguru.lesson8.tv;

public class TVController {

    private TV tv;

    public TVController(TV tv) {
        this.tv = tv;
    }

    public void onOff() {
        tv.onOff();
    }

    public void nextChannel() {
        tv.nextChannel();
    }

    public void previousChannel() {
        tv.previousChannel();
    }

    public void increaseVolume() {
        tv.increaseVolume();
    }

    public void decreaseVolume() {
        tv.decreaseVolume();
    }
}
