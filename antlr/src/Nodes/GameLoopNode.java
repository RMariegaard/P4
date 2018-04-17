package Nodes;

public class GameLoopNode extends Node {

    public GameLoopNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public BlockNode Block(){
        return (BlockNode) this.LeftmostChild;
    }
    @Override
    public String toString() {
        return "GameLoop";
    }
}
