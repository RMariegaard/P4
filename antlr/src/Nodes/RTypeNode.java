package Nodes;

public class RTypeNode extends Node {

    public RTypeNode(int firstLinenumber, String type) {
        super(firstLinenumber);
        switch (type) {
            case "text":
            case "string":
                Type = String.class;
                break;
            case "bool":
            case "boolean":
                Type = boolean.class;
                break;
            case "int":
                Type = int.class;
                break;
            case "decimal":
            case "double":
                Type = double.class;
                break;
            case "void":
                Type = void.class;
                break;
        }
    }

    @Override
    public String toString() {
        return Type.toString();

    }
}
