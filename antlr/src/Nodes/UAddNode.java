package Nodes;

public class UAddNode extends Node {


    public UAddNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node IDNode(){
        return LeftmostChild;
    }

    @Override
    public String toString() {
        return "++";
    }
}
