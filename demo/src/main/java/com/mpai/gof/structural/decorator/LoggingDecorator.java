package com.mpai.gof.structural.decorator;

public class LoggingDecorator extends NotifierDecorator {
    public LoggingDecorator(Notifier inner){ super(inner); }

    @Override
    public String send(String msg) {
        // Adăugăm comportament înainte/după delegare
        return "LOG(before) | " + inner.send(msg) + " | LOG(after)";
    }
}
