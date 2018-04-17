package Nodes.expr;

import Nodes.Node;


public class MulExprNode extends Node {

    public MulExprNode(int firstLinenumber) {
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
        return "*";
    }

}
