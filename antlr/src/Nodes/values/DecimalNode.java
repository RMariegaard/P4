package Nodes.values;

import Nodes.Node;

public class DecimalNode extends Node {
    public double value;

    public DecimalNode(int firstLinenumber, double value) {
        super(firstLinenumber);
        this.value = value;
    }


    @Override
    public String toString() {
        return Double.toString(value);
    }
}
