package com.mpai.gof.creational.factorymethod;

public class LightBulbCreator extends DeviceCreator {
    @Override protected Device createDevice() { return new LightBulb(); }
}
