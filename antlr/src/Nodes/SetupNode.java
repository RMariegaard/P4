package Nodes;

public class SetupNode extends Node {

    public Node BlockNode(){
        return this.LeftmostChild;
    }

    @Override
    public String toString() {
        return "Setup";
    }

}
