package Nodes.values;
import Nodes.Node;
public class IntNode extends Node {
    public int value;

    public IntNode(int firstLinenumber, int value) {
        super(firstLinenumber);
        this.value = value;
    }


    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
