package Nodes.values;

import Nodes.Node;

public class StringNode extends Node {
    public String value;



    public StringNode(int firstLinenumber, String value) {
        super(firstLinenumber);
        this.value = value;
    }


    @Override
    public String toString() {
        return value;
    }
}
