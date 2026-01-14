package com.mpai.gof.creational.factorymethod;

public class ThermostatCreator extends DeviceCreator {
    @Override protected Device createDevice() { return new Thermostat(); }
}
