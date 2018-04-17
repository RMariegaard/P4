package Nodes;

public class GreaterNode extends Node {


    public GreaterNode(int firstLinenumber) {
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
        return ">";
    }
}
