package Nodes;

public class ElseNode extends Node{


    public ElseNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public BlockNode Block(){
        return (BlockNode) this.LeftmostChild;
    }
    @Override
    public String toString() {
        return "Else";
    }
}
