package Nodes;

public class AssignNode extends Node {

    public Node RefNode(){
        return this.LeftmostChild;
    }
    public Node ValueNode(){
        return this.LeftmostChild.RightSibling;
    }


    @Override
    public String toString() {
        return "Assign";
    }

}
