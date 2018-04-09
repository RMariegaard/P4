package Nodes;

public class OrNode extends Node {

    public Node RightNode(){
        return this.LeftNode().RightSibling;
    }
    public Node LeftNode(){
        return this.LeftmostChild;
    }

    @Override
    public String toString() {
        return "||";
    }
}
