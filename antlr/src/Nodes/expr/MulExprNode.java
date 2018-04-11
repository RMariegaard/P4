package Nodes.expr;

import Nodes.expr.ExprNode;

import Nodes.Node;


public class MulExprNode extends ExprNode {

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
