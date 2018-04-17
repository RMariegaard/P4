package Nodes;

public class RTypeNode extends Node {

    public Object Typee;

    public RTypeNode(int firstLinenumber, String type) {
        super(firstLinenumber);
        if(type.equals("text"))
            Typee = String.class;
        else if(type.equals("bool"))
            Typee = boolean.class;
        else if(type.equals("int"))
            Typee = int.class;
        else if (type.equals("decimal"))
            Typee = double.class;
        else if (type.equals("void"))
            Typee = void.class;
    }

    @Override
    public String toString() {
        return Typee.toString();

    }
}
