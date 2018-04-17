package Nodes.expr;

import Nodes.Node;


public class NotExprNode extends Node {

    public NotExprNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node ExprNode(){
        return this.LeftmostChild;
    }


    @Override
    public String toString() {
        return "!";
    }
}
