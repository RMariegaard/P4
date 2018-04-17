package Nodes;

public class ReturnStmtNode extends Node {

    public ReturnStmtNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node ExprNode(){
        return this.LeftmostChild;
    }

    @Override
    public String toString() {
        return "Return";
    }
}
