package Nodes;

public class ArgumentNode extends Node {

    public String Type;

    public RefNode RefNode(){
        return (RefNode) this.LeftmostChild;
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
