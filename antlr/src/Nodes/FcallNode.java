package Nodes;

import Nodes.values.IDNode;

public class FcallNode extends Node {
    public FcallNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public IDNode IDNode(){
        return (IDNode) this.LeftmostChild;
    }

    public int NumberOfArguments(){
        Node node = IDNode().RightSibling;
        int result = 0;
        while (node != null){
            result++;
            node = node.RightSibling;
        }
        return result;
    }

    public Node[] ArgumentNodes(){
        Node[] array = new Node[NumberOfArguments()];
        Node node = IDNode().RightSibling;
        for(int i = 0; i<array.length; i++){
            array[i] = node;
            node = node.RightSibling;
        }
        return array;
    }

    @Override
    public String toString() {
        return "FCall";
    }
}
