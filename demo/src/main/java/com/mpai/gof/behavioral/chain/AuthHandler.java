package com.mpai.gof.behavioral.chain;

public class AuthHandler extends Handler {
    protected String tryHandle(Request r) {
        if (r.user() == null || r.user().isBlank()) return "AUTH_FAIL";
        return null;
    }
}

