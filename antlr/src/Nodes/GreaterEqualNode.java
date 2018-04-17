package Nodes;

public class GreaterEqualNode extends Node {


    public GreaterEqualNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node RightNode(){
        return this.LeftNode().RightSibling;
    }
    public Node LeftNode(){
        return this.LeftmostChild;
    }

    @Override
    public String toString() {
        return ">=";
    }
}
