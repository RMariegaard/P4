package Nodes;

public class BlockNode extends Node {


    public BlockNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public int NumberOfStatements(){
        int result = 0;
        Node node = this.LeftmostChild;
        while(node != null) {
            result++;
            node = node.RightSibling;
        }
        return result;
    }

    public Node[] StmtNodes(){
        Node[] array = new Node[NumberOfStatements()];
        Node node = this.LeftmostChild;
        for(int i=0; i<array.length; i++){
            array[i] = node;
            node = node.RightSibling;
        }
        return array;
    }

    @Override
    public String toString() {
        return "Block";
    }
}
