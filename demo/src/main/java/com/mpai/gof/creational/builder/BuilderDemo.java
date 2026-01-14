package com.mpai.gof.creational.builder;

public class BuilderDemo {
    public static String run() {
        AutomationRule rule = new AutomationRule.Builder()
                .name("Night mode")
                .trigger("time=23:00")
                .addAction("turnOffLights")
                .addAction("setThermostat=19")
                .enabled(true)
                .build();
        return rule.describe();
    }
}
