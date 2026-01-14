package com.mpai.gof.behavioral.state;

public class StateDemo {
    public static String run() {
        SmartModeContext ctx = new SmartModeContext(new DayMode());
        return ctx.pressButton() + " | " + ctx.pressButton();
    }
}
