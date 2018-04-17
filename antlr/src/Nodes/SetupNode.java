package Nodes;

public class SetupNode extends Node {

    public SetupNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node BlockNode(){
        return this.LeftmostChild;
    }

    @Override
    public String toString() {
        return "Setup";
    }

}
