package com.javaguru.lesson8.tv;

public class TV {

    private static final int MAX_CHANNEL = 100;
    private static final int MIN_CHANNEL = 1;
    private static final int MAX_VOLUME = 30;
    private static final int MIN_VOLUME = 0;

    private boolean turnedOn;
    private int channel = MIN_CHANNEL;
    private int volume;

    public void onOff() {
        turnedOn = !turnedOn;
        System.out.println("Turned on: " + turnedOn);
    }

    public void nextChannel() {
        if (turnedOn) {
            if (channel < MAX_CHANNEL) {
                channel++;
            } else {
                channel = MIN_CHANNEL;
            }
            System.out.println("Current channel: " + channel);
        }
    }

    public void previousChannel() {
        if (turnedOn) {
            if (channel > MIN_CHANNEL) {
                channel--;
            } else {
                channel = MAX_CHANNEL;
            }
            System.out.println("Current channel: " + channel);
        }
    }

    public void increaseVolume() {
        if (turnedOn) {
            if (volume < MAX_VOLUME) {
                volume++;
            }
            System.out.println("Current volume: " + volume);
        }
    }

    public void decreaseVolume() {
        if (turnedOn) {
            if (volume > MIN_VOLUME) {
                volume--;
            }
            System.out.println("Current volume: " + volume);
        }
    }
}
