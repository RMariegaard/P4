package Nodes;

public class ElseIfNode extends Node {


    public ElseIfNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node Condition(){
        return this.LeftmostChild;
    }

    public BlockNode Block(){
        return (BlockNode) this.Condition().RightSibling;
    }

    @Override
    public String toString() {
        return "ElseIf";
    }
}
