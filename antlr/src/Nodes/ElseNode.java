package Nodes;

public class ElseNode extends Node{


    public Node Block(){
        return this.LeftmostChild;
    }
    @Override
    public String toString() {
        return "Else";
    }
}
