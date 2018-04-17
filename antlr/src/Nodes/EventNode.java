package Nodes;

import Nodes.values.IDNode;

public class EventNode extends Node {

    public EventNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node ExprNode(){
        return this.LeftmostChild;
    }
    public IDNode ID(){
        return (IDNode) this.ExprNode().RightSibling;
    }

    @Override
    public String toString() {
        return "Event";
    }

}
