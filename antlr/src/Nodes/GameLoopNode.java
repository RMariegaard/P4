package Nodes;

public class GameLoopNode extends Node {

    public Node Block(){
        return this.LeftmostChild;
    }
    @Override
    public String toString() {
        return "GameLoop";
    }
}
