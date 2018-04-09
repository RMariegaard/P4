package Nodes;

public class StrategyNode extends Node {


    public Node IDNode(){
        return this.LeftmostChild;
    }

    public Node BehaviourNode(){
        return IDNode().RightSibling;
    }

    @Override
    public String toString() {
        return "Strategy";
    }
}
