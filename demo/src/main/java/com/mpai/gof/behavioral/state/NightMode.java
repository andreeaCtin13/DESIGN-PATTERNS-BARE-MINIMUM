package com.mpai.gof.behavioral.state;

import com.mpai.gof.behavioral.state.DayMode;
import com.mpai.gof.behavioral.state.ModeState;
import com.mpai.gof.behavioral.state.SmartModeContext;

public class NightMode implements ModeState {
    public String handle(SmartModeContext ctx){
        ctx.setState(new DayMode());
        return "NIGHT -> switch to DAY";
    }
}
