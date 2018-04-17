package Nodes.expr;


import Nodes.Node;


public class DivExprNode extends Node {

    public DivExprNode(int firstLinenumber) {
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
        return "/";
    }
}

