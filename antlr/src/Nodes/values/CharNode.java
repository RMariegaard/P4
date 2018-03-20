package Nodes.values;

import Nodes.Node;

public class CharNode extends Node {
    public char value;

    public CharNode(char value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return Character.toString(value);
    }
}
