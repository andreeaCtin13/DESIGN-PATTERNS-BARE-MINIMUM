package com.mpai.gof.creational.builder;

import java.util.List;

public class AutomationRule {
    private final String name;
    private final String trigger;
    private final List<String> actions;
    private final boolean enabled;

    private AutomationRule(Builder b) {
        this.name = b.name;
        this.trigger = b.trigger;
        this.actions = List.copyOf(b.actions);
        this.enabled = b.enabled;
    }

    public String describe() {
        return "Rule{name='%s', trigger='%s', actions=%s, enabled=%s}"
                .formatted(name, trigger, actions, enabled);
    }

    /**
     * Builder static: ușor de citit, fluent, extensibil.
     * Notă: în practică poți valida câmpuri în build().
     */
    public static class Builder {
        private String name;
        private String trigger;
        private java.util.ArrayList<String> actions = new java.util.ArrayList<>();
        private boolean enabled = true;

        public Builder name(String n){ this.name = n; return this; }
        public Builder trigger(String t){ this.trigger = t; return this; }
        public Builder addAction(String a){ this.actions.add(a); return this; }
        public Builder enabled(boolean e){ this.enabled = e; return this; }

        public AutomationRule build(){
            if (name == null || trigger == null) throw new IllegalStateException("name/trigger obligatorii");
            return new AutomationRule(this);
        }
    }
}
