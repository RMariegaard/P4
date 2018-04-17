package Nodes;

import Nodes.values.IDNode;

public class BehaviorNode extends Node {

    public BehaviorNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public IDNode IDNode(){
        return (IDNode) this.LeftmostChild;
    }
    public BlockNode BlockNode(){
        return (BlockNode) this.IDNode().RightSibling;
    }

    @Override
    public String toString() {
        return "Behaviour";
    }
}
