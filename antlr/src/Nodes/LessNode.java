package Nodes;

public class LessNode extends Node {

    public LessNode(int firstLinenumber) {
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
        return "<";
    }
}
