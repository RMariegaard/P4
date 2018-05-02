package Nodes;

import Nodes.values.IDNode;

public class MethodNode extends Node {
    public String APIName;
    public MethodNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public IDNode IDNode(){
        return (IDNode) this.LeftmostChild;
    }
    public RTypeNode RTypeNode(){ return (RTypeNode) this.IDNode().RightSibling;}

    public int NumberOfParameters(){
        int number = 0;
        Node node = RTypeNode();
        while(!(node.RightSibling instanceof BlockNode)){
            node = node.RightSibling;
            if(node == null) //Methods imported from RoboCodeAPI doesn't have a blockNode
                break;
            number++; //Has to count last, or else the API with no parameters will be set to 1
        }
        return number;
    }

    public ArgumentNode[] Parameters(){
        ArgumentNode[] array = new ArgumentNode[NumberOfParameters()];
        Node node = this.RTypeNode();
        for(int i=0; i<array.length; i++){
            node = node.RightSibling;
            array[i] = (ArgumentNode) node;
        }
        return array;
    }

    public BlockNode BlockNode(){
        Node node = Parameters()[NumberOfParameters()-1];
        return (BlockNode) node.RightSibling;
    }

    @Override
    public String toString() {
        return "Method";
    }
}
