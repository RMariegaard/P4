package Nodes.values;

import Nodes.Node;

public class BoolNode extends Node {
    public Boolean value;

    public BoolNode(int firstLinenumber, Boolean value) {
        super(firstLinenumber);
        this.value = value;
    }


    @Override
    public String toString() {
        return value ? "true": "false";
    }
}
