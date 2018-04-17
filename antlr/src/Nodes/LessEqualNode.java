package Nodes;

public class LessEqualNode extends Node{

    public LessEqualNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node RightNode(){
        return this.LeftNode().RightSibling;
    }
    public Node LeftNode(){
        return this.LeftmostChild;
    }
    @Override
    public String toString() {
        return "<=";
    }
}
