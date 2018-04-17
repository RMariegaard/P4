package Nodes;

public class DclNode extends Node {
    public Object Type;

    public Node ChildNode(){
        return LeftmostChild;
    }

    public DclNode(String type) {
        super();
        if(type.equals("text"))
            Type = String.class;
        else if(type.equals("bool"))
            Type = boolean.class;
        else if(type.equals("int"))
            Type = int.class;
        else if (type.equals("decimal"))
            Type = double.class;

    }
    public String getID(){
        Node idNode = LeftmostChild;
        while(idNode.LeftmostChild != null)
            idNode = idNode.LeftmostChild;
        return idNode.toString();
    }
    @Override
    public String toString() {
        return Type.toString() + " Dcl " + getID();
    }
}
