package Nodes;

public class EventNode extends Node {

    public EventNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node ExprNode(){
        return this.LeftmostChild;
    }
    public Node ID(){
        return this.ExprNode().RightSibling;
    }

    @Override
    public String toString() {
        return "Event";
    }

}
