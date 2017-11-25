package com.javaguru.lesson8.tv;

public class TVTest {

    public static void main(String[] args) {
        TV tv = new TV();
        tv.onOff();

        for (int i = 0; i < 50; i++) {
            tv.decreaseVolume();
        }
    }
}
