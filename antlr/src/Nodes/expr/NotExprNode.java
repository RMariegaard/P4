package Nodes.expr;

import Nodes.expr.ExprNode;

import Nodes.Node;


public class NotExprNode extends ExprNode {

    public Node ExprNode(){
        return this.LeftmostChild;
    }


    @Override
    public String toString() {
        return "!";
    }
}
