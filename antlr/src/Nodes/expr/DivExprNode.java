package Nodes.expr;


import Nodes.Node;


public class DivExprNode extends ExprNode {

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

