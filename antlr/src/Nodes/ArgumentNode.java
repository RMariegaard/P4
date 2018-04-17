package Nodes;

public class ArgumentNode extends Node {

    public String Type;

    public Node RefNode(){
        return this.LeftmostChild;
    }
    public ArgumentNode(int firstLinenumber, String type) {
        super(firstLinenumber);
        Type = type;
    }

    @Override
    public String toString() {
        return Type + "Arg";
    }

}
