package com.mpai.gof.behavioral.mediator;

/** Componenta de bază știe mediatorul */
public abstract class Component {
    protected final Mediator mediator;
    protected Component(Mediator mediator){ this.mediator = mediator; }
}
