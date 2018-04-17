package Nodes;

public class GameLoopNode extends Node {

    public GameLoopNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node Block(){
        return this.LeftmostChild;
    }
    @Override
    public String toString() {
        return "GameLoop";
    }
}
