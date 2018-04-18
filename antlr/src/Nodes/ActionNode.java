package Nodes;

import Nodes.values.IDNode;

public class ActionNode extends Node {


    public ActionNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public int NumberOfIDNodes(){
        int result = 0;
        Node node = this.LeftmostChild;

        while(node instanceof IDNode){
            result++;
            node = node.RightSibling;
        }
        return result;
    }

    public IDNode[] IDNodes(){
        IDNode[] array = new IDNode[NumberOfIDNodes()];
        Node node = this.LeftmostChild;
        for(int i = 0; i<array.length; i++){
            array[i] = (IDNode) node;
            node =  node.RightSibling;
        }
        return array;
    }

    public FcallNode Fcall(){
        Node[] array = IDNodes();
        if(array.length > 0){
            return (FcallNode) array[array.length-1].RightSibling;
        }
        else{
            return (FcallNode) this.LeftmostChild; //If the array is empty then the leftmost child most be the fcall
        }
    }

    @Override
    public String toString() {
        return "Action";
    }
}
