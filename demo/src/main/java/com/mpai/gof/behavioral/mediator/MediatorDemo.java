package com.mpai.gof.behavioral.mediator;

public class MediatorDemo {
    public static String run() {
        SecurityMediator m = new SecurityMediator();
        Alarm alarm = new Alarm(m);
        m.setAlarm(alarm);
        MotionSensor sensor = new MotionSensor(m);

        return sensor.motionDetected();
    }
}
