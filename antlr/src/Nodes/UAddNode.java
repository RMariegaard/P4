package Nodes;

public class UAddNode extends Node {


    public UAddNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public RefNode RefNode(){
        return (RefNode) LeftmostChild;
    }

    @Override
    public String toString() {
        return "++";
    }
}
