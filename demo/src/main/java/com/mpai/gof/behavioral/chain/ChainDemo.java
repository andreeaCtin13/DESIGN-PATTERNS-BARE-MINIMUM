
package com.mpai.gof.behavioral.chain;

public class ChainDemo {
    public static String run() {
        Handler root = new AuthHandler();
        root.linkWith(new PermissionHandler()).linkWith(new ExecuteHandler());

        return root.handle(new Request("guest", "DELETE")) + " | " +
                root.handle(new Request("admin", "DELETE"));
    }
}
