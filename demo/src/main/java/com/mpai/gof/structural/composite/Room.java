package com.mpai.gof.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Room implements Node {
    private final String name;
    private final List<Node> children = new ArrayList<>();

    public Room(String name){ this.name = name; }

    public void add(Node n){ children.add(n); }

    @Override
    public String operation() {
        return "Room(" + name + ")->" + children.stream().map(Node::operation).toList();
    }
}
