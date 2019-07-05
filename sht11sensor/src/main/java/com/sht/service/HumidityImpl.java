package com.sht.service;

import com.pi4j.io.gpio.PinState;

public class HumidityImpl implements Humidity {
    @Override
    public double getHumidity() {
        return 0;
    }

    @Override
    public void sendCommand(int Command) throws InterruptedException {

    }

    @Override
    public void setClock(PinState pinState) throws InterruptedException {

    }
}
