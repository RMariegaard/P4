package Nodes.expr;

import Nodes.Node;

public class SubExprNode extends Node {

    public SubExprNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node LeftNode(){
        return this.LeftmostChild;
    }
    public Node RightNode(){
        return this.LeftNode().RightSibling;
    }

    @Override
    public String toString() {
        return "-";
    }
}
