package Nodes;

public class IfStmtNode extends Node {

    public IfStmtNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public Node Condition(){
        return this.LeftmostChild;
    }

    public BlockNode Block(){
        return (BlockNode) this.Condition().RightSibling;
    }

    public int NumberOfElseIf(){
        Node node = this.Block();
        int result = 0;
        while(node.RightSibling != null){
            result++;
            node = node.RightSibling;
        }
        //the last else node is counted in the loop above
        // If there is no else block nor else if then we have to return 0 and not -1
        return result == 0 ? 0 : result - 1;
    }

    public ElseIfNode[] ElseIf(){
        ElseIfNode[] array = new ElseIfNode[NumberOfElseIf()];
        Node node = this.Block();
        for(int i=0; i<array.length; i++){
            node = node.RightSibling;
            array[i] = (ElseIfNode) node;
        }
        return array;
    }


    @Override
    public String toString() {
        return "If";
    }
}
