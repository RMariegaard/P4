package Nodes;

public class UsubNode extends Node {

    public UsubNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node IDNode(){
        return LeftmostChild;
    }

    @Override
    public String toString() {
        return "--";
    }
}
