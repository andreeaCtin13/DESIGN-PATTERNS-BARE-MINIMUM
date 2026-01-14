package com.mpai.gof.behavioral.mediator;

import com.mpai.gof.behavioral.mediator.Component;
import com.mpai.gof.behavioral.mediator.Mediator;

public class Alarm extends Component {
    public Alarm(Mediator m){ super(m); }
    public String ring(){ return "ALARM RING"; }
}
