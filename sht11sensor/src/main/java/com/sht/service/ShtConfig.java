package com.sht.service;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;

public class ShtConfig {

    private Pin dataPin;
    private Pin sckPin;
    private GpioController gpioController;

    public ShtConfig(Pin dataPin, Pin sckPin, GpioController gpioController) {
        this.dataPin = dataPin;
        this.sckPin = sckPin;
        this.gpioController = gpioController;


    }

    public GpioController getGpioController() {
        return gpioController;
    }


}
