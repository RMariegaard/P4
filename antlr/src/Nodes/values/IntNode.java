package Nodes.values;
import Nodes.Node;
public class IntNode extends Node {
    public int value;

    public IntNode(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Int";
    }
}
