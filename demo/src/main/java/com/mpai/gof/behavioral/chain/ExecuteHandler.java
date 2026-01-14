package com.mpai.gof.behavioral.chain;

public class ExecuteHandler extends Handler {
    protected String tryHandle(Request r) {
        return "EXECUTED " + r.action() + " by " + r.user();
    }
}
