package Nodes;

public class RTypeNode extends Node {

    public RTypeNode(int firstLinenumber, String type) {
        super(firstLinenumber);
        if(type.equals("text"))
            Type = String.class;
        else if(type.equals("bool") || type.equals("boolean"))
            Type = boolean.class;
        else if(type.equals("int"))
            Type = int.class;
        else if (type.equals("decimal") || type.equals("double"))
            Type = double.class;
        else if (type.equals("void"))
            Type = void.class;
    }

    @Override
    public String toString() {
        return Type.toString();

    }
}
