package Nodes;

import Nodes.values.IDNode;

public class EventNode extends Node {

    public EventNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node ExprNode(){
        return this.ID().RightSibling;
    }
    public IDNode ID(){
        return (IDNode) this.LeftmostChild;
    }

    @Override
    public String toString() {
        return "Event";
    }

}
