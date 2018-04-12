package Nodes;

public class StrategyNode extends Node {


    public Node IDNode(){
        return this.LeftmostChild;
    }

    public int NumberOfBehaviours(){
        int result = 0;
        Node node = this.IDNode();
        while(node.RightSibling != null){
            result++;
        }
        return result;
    }

    public Node[] BehaviourNodes(){
        Node[] array = new Node[NumberOfBehaviours()];
        Node node = this.IDNode();
        for(int i=0; i<array.length; i++){
            node = node.RightSibling;
            array[i] = node;
        }
        return array;
    }

    public Node BehaviourNode(){
        return IDNode().RightSibling;
    }

    @Override
    public String toString() {
        return "Strategy";
    }
}
