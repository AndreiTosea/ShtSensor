package com.sht.service;

import com.pi4j.io.gpio.PinState;

public interface ShtService {
    void sendCommand(int Command) throws InterruptedException;
    void setClock(PinState pinState) throws InterruptedException;
}
