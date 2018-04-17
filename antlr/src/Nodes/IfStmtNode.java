package Nodes;

public class IfStmtNode extends Node {

    public IfStmtNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node Condition(){
        return this.LeftmostChild;
    }

    public Node Block(){
        return this.Condition().RightSibling;
    }

    public int NumberOfElseIf(){
        Node node = this.Block();
        int result = 0;
        while(node.RightSibling != null){
            result++;
        }
        //the last else node is counted in the loop above
        // If there is no else block nor else if then we have to return 0 and not -1
        return result == 0 ? 0 : result - 1;
    }

    public Node[] ElseIf(){
        Node[] array = new Node[NumberOfElseIf()];
        Node node = this.Block();
        for(int i=0; i<array.length; i++){
            node = node.RightSibling;
            array[i] = node;
        }
        return array;
    }


    @Override
    public String toString() {
        return "If";
    }
}
