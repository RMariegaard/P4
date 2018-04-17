package Nodes;

public class DoStmtNode extends Node {

    public DoStmtNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public ArgumentNode VariableNode(){
        return (ArgumentNode) this.LeftmostChild;
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

    public BlockNode BlockNode(){
        return (BlockNode) IncrementNode().RightSibling;
    }


    @Override
    public String toString() {
        return "Do";
    }
}
