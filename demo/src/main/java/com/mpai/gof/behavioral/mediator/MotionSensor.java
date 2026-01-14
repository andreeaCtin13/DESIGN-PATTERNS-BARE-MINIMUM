package com.mpai.gof.behavioral.mediator;

public class MotionSensor extends Component {
    public MotionSensor(Mediator m){ super(m); }
    public String motionDetected(){
        return mediator.notify(this, "MOTION");
    }
}

