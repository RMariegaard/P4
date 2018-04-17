package Nodes;

public class AssignNode extends Node {

    public AssignNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node IDNode(){
        return this.LeftmostChild;
    }
    public Node ValueNode(){
        return this.IDNode().RightSibling;
    }


    @Override
    public String toString() {
        return "Assign";
    }

}
