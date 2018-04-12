package Nodes;

public class DoStmtNode extends Node {

    public Node VariableNode(){
        return this.LeftmostChild;
    }

    public Node StartValueNode(){
        return VariableNode().RightSibling;
    }

    public Node EndValueNode(){
        return StartValueNode().RightSibling;
    }

    public Node IncrementNode(){
        return EndValueNode().RightSibling;
    }

    public Node BlockNode(){
        return IncrementNode().RightSibling;
    }


    @Override
    public String toString() {
        return "Do";
    }
}
