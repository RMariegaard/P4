package Nodes;

public class RTypeNode extends Node {

    public String TypeString;

    public RTypeNode(int firstLinenumber, String typeString) {
        super(firstLinenumber);
        this.TypeString = typeString;
    }

    @Override
    public String toString() {
        return TypeString;

    }
}
