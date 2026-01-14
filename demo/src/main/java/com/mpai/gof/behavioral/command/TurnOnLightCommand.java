package com.mpai.gof.behavioral.command;

public class TurnOnLightCommand implements Command {
    private final LightReceiver receiver;
    public TurnOnLightCommand(LightReceiver r){ this.receiver = r; }
    public String execute(){ return receiver.on(); }
}

