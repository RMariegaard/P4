package Nodes;

public class ParenNode extends Node{
    public ParenNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node Aoexpr(){
        return LeftmostChild;
    }
}
