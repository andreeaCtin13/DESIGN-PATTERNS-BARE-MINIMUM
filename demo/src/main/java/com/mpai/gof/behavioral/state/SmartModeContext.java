package com.mpai.gof.behavioral.state;

public class SmartModeContext {
    private ModeState state;

    public SmartModeContext(ModeState initial){ this.state = initial; }
    public void setState(ModeState s){ this.state = s; }

    public String pressButton(){
        // delegăm comportamentul stării curente
        return state.handle(this);
    }
}
