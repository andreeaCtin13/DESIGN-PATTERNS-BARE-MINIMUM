package com.mpai.gof.behavioral.state;

public class DayMode implements ModeState {
    public String handle(SmartModeContext ctx){
        ctx.setState(new NightMode());
        return "DAY -> switch to NIGHT";
    }
}
