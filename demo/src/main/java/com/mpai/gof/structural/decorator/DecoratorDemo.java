package com.mpai.gof.structural.decorator;

public class DecoratorDemo {
    public static String run() {
        Notifier n = new LoggingDecorator(new BasicNotifier());
        return n.send("Alarm!");
    }
}
