package Nodes;

public class ArgumentNode extends Node {

    public RefNode RefNode(){
        return (RefNode) this.LeftmostChild;
    }
    public ArgumentNode(int firstLinenumber, String type) {
        super(firstLinenumber);
        if(type.equals("text") || type.equals("string"))
            Type = String.class;
        else if(type.equals("bool") || type.equals("boolean"))
            Type = boolean.class;
        else if(type.equals("int"))
            Type = int.class;
        else if (type.equals("decimal") || type.equals("double"))
            Type = double.class;
    }

    @Override
    public String toString() {
        return Type + "Arg";
    }

}
