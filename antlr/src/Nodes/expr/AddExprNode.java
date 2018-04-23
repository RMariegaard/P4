package Nodes.expr;

import Nodes.Node;


public class AddExprNode extends Node {


    public AddExprNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node LeftNode(){
        return this.LeftmostChild;
    }
    public Node RightNode(){
        return this.LeftNode().RightSibling;
    }
    public boolean ErrorOccured = false;
    @Override
    public String toString() {
        return "+";
    }

}

