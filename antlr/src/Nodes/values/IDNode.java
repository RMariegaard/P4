package Nodes.values;

import Nodes.Node;

public class IDNode extends Node {
    public String idString;

    public IDNode(String idString) {
        this.idString = idString;
    }


    @Override
    public String toString() {
        return "ID";
    }
}
