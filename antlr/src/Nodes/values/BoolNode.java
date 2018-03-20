package Nodes.values;

import Nodes.Node;

public class BoolNode extends Node {
    public Boolean value;

    public BoolNode(Boolean value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Bool";
    }
}
