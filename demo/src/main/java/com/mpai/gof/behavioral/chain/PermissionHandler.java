package com.mpai.gof.behavioral.chain;

public class PermissionHandler extends Handler {
    protected String tryHandle(Request r) {
        if ("guest".equals(r.user()) && "DELETE".equals(r.action())) return "PERMISSION_DENIED";
        return null;
    }
}