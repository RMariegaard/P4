package Nodes;

import Nodes.values.IDNode;

public class ActionNode extends Node {


    public int NumberOfIDNodes(){
        int result = 0;
        Node node = this.LeftmostChild;

        while(node instanceof IDNode){
            result++;
            node = node.RightSibling;
        }
        return result;
    }

    public Node[] IDNodes(){
        Node[] array = new Node[NumberOfIDNodes()];
        Node node = this.LeftmostChild;
        for(int i = 0; i<array.length; i++){
            array[i] = node;
            node = node.RightSibling;
        }
        return array;
    }


    @Override
    public String toString() {
        return "Action";
    }
}
