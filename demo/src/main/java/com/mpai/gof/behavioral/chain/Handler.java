package com.mpai.gof.behavioral.chain;

/**
 * Handler: are referință la "next".
 * Fie procesează, fie pasează mai departe.
 */
public abstract class Handler {
    protected Handler next;

    public Handler linkWith(Handler next) { this.next = next; return next; }

    public String handle(Request r) {
        String res = tryHandle(r);
        if (res != null) return res;
        return (next != null) ? next.handle(r) : "UNHANDLED";
    }

    /** întoarce non-null dacă a procesat request-ul */
    protected abstract String tryHandle(Request r);
}
