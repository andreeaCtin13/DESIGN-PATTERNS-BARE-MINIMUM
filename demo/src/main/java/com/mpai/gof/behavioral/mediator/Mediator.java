package com.mpai.gof.behavioral.mediator;

public interface Mediator {
    String notify(Component sender, String event);
}
