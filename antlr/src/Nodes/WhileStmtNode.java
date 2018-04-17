package Nodes;

public class WhileStmtNode extends Node {

    public WhileStmtNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node ConditionNode(){
        return this.LeftmostChild;
    }

    public BlockNode BlockNode(){
        return (BlockNode) this.ConditionNode().RightSibling;
    }



    @Override
    public String toString() {
        return "While";
    }
}
