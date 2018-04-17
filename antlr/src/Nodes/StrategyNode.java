package Nodes;

import Nodes.values.IDNode;

public class StrategyNode extends Node {


    public StrategyNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public IDNode IDNode(){
        return (IDNode) this.LeftmostChild;
    }

    public int NumberOfBehaviours(){
        int result = 0;
        Node node = this.IDNode();
        while(node.RightSibling != null){
            node = node.RightSibling;
            result++;
        }
        return result;
    }

    public BehaviorNode[] BehaviourNodes(){
        BehaviorNode[] array = new BehaviorNode[NumberOfBehaviours()];
        Node node = this.IDNode();
        for(int i=0; i<array.length; i++){
            node = node.RightSibling;
            array[i] = (BehaviorNode) node;
        }
        return array;
    }


    @Override
    public String toString() {
        return "Strategy";
    }
}
