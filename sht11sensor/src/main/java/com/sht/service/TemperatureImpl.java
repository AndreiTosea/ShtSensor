package com.sht.service;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;

public class TemperatureImpl implements Temperature {

    private ShtConfig controller;
    private int timer;
    private Pin syncPin;

    public TemperatureImpl(Pin dataPin, Pin syncPin, GpioController gpioController, int timer) {
        this.controller = new ShtConfig(dataPin, syncPin, gpioController);
        this.timer = timer;
        this.syncPin = syncPin;
    }

    @Override
    public double getTemperature() {
        return 0;
    }

    @Override
    public void sendCommand(int Command) throws InterruptedException {

    }

    @Override
    public void setClock(PinState pinState) throws InterruptedException {
        controller.getGpioController().provisionDigitalOutputPin(syncPin,pinState);
        Thread.sleep(timer);
    }
}
