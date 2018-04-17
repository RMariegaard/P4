package Nodes;

public class SetupNode extends Node {

    public SetupNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public BlockNode BlockNode(){
        return (BlockNode) this.LeftmostChild;
    }

    @Override
    public String toString() {
        return "Setup";
    }

}
