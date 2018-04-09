package Nodes;

public class WhileStmtNode extends Node {

    public Node ConditionNode(){
        return this.LeftmostChild;
    }

    public Node BlockNode(){
        return this.ConditionNode().RightSibling;
    }



    @Override
    public String toString() {
        return "While";
    }
}
