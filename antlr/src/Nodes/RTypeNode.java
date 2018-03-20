package Nodes;

public class RTypeNode extends Node {

    public String TypeString;

    public RTypeNode(String typeString) {
        this.TypeString = typeString;
    }

    @Override
    public String toString() {
        return TypeString;

    }
}
