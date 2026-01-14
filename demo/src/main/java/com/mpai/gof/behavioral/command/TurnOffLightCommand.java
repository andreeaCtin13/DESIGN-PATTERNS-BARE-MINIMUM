package com.mpai.gof.behavioral.command;

import com.mpai.gof.behavioral.command.Command;
import com.mpai.gof.behavioral.command.LightReceiver;

public class TurnOffLightCommand implements Command {
    private final LightReceiver receiver;
    public TurnOffLightCommand(LightReceiver r){ this.receiver = r; }
    public String execute(){ return receiver.off(); }
}