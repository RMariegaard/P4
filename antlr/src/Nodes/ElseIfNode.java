package Nodes;

public class ElseIfNode extends Node {


    public ElseIfNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node Condition(){
        return this.LeftmostChild;
    }

    public Node Block(){
        return this.Condition().RightSibling;
    }

    @Override
    public String toString() {
        return "ElseIf";
    }
}
