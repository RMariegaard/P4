package Nodes;

public class ReturnStmtNode extends Node {

    public Node ExprNode(){
        return this.LeftmostChild;
    }

    @Override
    public String toString() {
        return "Return";
    }
}
