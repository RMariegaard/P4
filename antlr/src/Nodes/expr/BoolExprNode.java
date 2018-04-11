package Nodes.expr;

import Nodes.Node;

public class BoolExprNode extends ExprNode {

    public Node LeftNode(){
        return this.LeftmostChild;
    }
    public Node RightNode(){
        return this.LeftNode().RightSibling;
    }

    @Override
    public String toString() {
        return "BoolExpr";
    }

}

