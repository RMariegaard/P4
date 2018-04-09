package Nodes;

public class UAddNode extends Node {


    public Node IDNode(){
        return LeftmostChild;
    }

    @Override
    public String toString() {
        return "++";
    }
}
