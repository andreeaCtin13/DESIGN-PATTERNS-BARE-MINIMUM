package com.mpai.gof.behavioral.mediator;

/**
 * Mediator concret: coordonează interacțiunile.
 * Ex: dacă motion -> pornește alarma.
 */
public class SecurityMediator implements Mediator {
    private Alarm alarm;

    public void setAlarm(Alarm alarm){ this.alarm = alarm; }

    public String notify(Component sender, String event) {
        if ("MOTION".equals(event)) return alarm.ring();
        return "NO_ACTION";
    }
}
