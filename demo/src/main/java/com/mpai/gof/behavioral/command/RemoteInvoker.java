package com.mpai.gof.behavioral.command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Invoker: ține comenzi și le execută (poate loga / face undo).
 */
public class RemoteInvoker {
    private final Deque<Command> queue = new ArrayDeque<>();
    public void add(Command c){ queue.add(c); }
    public String runAll(){
        StringBuilder sb = new StringBuilder();
        while(!queue.isEmpty()){
            sb.append(queue.remove().execute()).append(" | ");
        }
        return sb.toString();
    }
}
