package Nodes;

public class AssignNode extends Node {

    public RefNode RefNode(){
        return (RefNode) this.LeftmostChild;
    }

    public AssignNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node ValueNode(){
        return this.LeftmostChild.RightSibling;
    }

    @Override
    public String toString() {
        return "Assign";
    }

}
