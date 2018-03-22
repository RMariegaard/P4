package Nodes;

public class DclNode extends Node {
    public String Type;

    public DclNode(String type) {
        super();
        Type = type;
    }

    @Override
    public String toString() {
        return Type + "Dcl";
    }

}
