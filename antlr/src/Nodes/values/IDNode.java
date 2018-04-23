package Nodes.values;

import Nodes.Node;

public class IDNode extends Node {
    public String idString;

    public IDNode(int firstLinenumber, String idString) {
        super(firstLinenumber);
        this.idString = idString;
    }


    @Override
    public String toString() {
        return idString;
    }
}
