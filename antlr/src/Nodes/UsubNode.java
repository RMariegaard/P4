package Nodes;

public class UsubNode extends Node {

    public Node IDNode(){
        return LeftmostChild;
    }

    @Override
    public String toString() {
        return "--";
    }
}
