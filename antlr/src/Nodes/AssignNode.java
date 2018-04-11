package Nodes;

public class AssignNode extends Node {

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
