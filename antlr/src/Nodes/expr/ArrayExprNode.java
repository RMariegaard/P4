package Nodes.expr;

import Nodes.Node;

public class ArrayExprNode extends Node {

    public ArrayExprNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node IDNode(){
        return this.LeftmostChild;
    }

    public Node ExprNode(){
        return this.IDNode().RightSibling;
    }

    @Override
    public String toString() {
        return "Array";
    }


}
