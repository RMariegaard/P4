package Nodes;

public class ElseNode extends Node{


    public ElseNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node Block(){
        return this.LeftmostChild;
    }
    @Override
    public String toString() {
        return "Else";
    }
}
