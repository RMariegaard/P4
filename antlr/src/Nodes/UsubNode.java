package Nodes;

public class UsubNode extends Node {

    public UsubNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public RefNode RefNode(){
        return (RefNode) LeftmostChild;
    }

    @Override
    public String toString() {
        return "--";
    }
}
