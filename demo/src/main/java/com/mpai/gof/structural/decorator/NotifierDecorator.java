package com.mpai.gof.structural.decorator;

/**
 * Decorator abstract: păstrează aceeași interfață și ține o referință la componentă.
 */
public abstract class NotifierDecorator implements Notifier {
    protected final Notifier inner;
    protected NotifierDecorator(Notifier inner){ this.inner = inner; }
}
