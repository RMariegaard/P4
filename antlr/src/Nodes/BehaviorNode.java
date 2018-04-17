package Nodes;

public class BehaviorNode extends Node {

    public BehaviorNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node IDNode(){
        return this.LeftmostChild;
    }
    public Node BlockNode(){
        return this.IDNode().RightSibling;
    }

    @Override
    public String toString() {
        return "Behaviour";
    }
}
