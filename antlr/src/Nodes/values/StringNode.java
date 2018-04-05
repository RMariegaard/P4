package Nodes.values;

import Nodes.Node;

public class StringNode extends Node {
    public String value;

    public StringNode(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }
}
