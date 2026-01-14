package com.mpai.gof.structural.decorator;

public class BasicNotifier implements Notifier {
    public String send(String msg){ return "SEND:" + msg; }
}
