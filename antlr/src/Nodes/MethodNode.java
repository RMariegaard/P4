package Nodes;

public class MethodNode extends Node {

    public MethodNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node IDNode(){
        return this.LeftmostChild;
    }

    public int NumberOfParameters(){
        int number = 0;
        Node node = IDNode();
        while(!(node.RightSibling instanceof BlockNode)){
            number++;
        }
        return number;
    }

    public Node[] Parameters(){
        Node[] array = new Node[NumberOfParameters()];
        Node node = this.IDNode();
        for(int i=0; i<array.length; i++){
            node = node.RightSibling;
            array[i] = node;
        }
        return array;
    }

    public Node BlockNode(){
        Node node = Parameters()[NumberOfParameters()-1];
        return node.RightSibling;
    }

    @Override
    public String toString() {
        return "Method";
    }
}
