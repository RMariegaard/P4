package Nodes;

public class RefNode extends Node {

    public RefNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public boolean IsArrayRef(){
        return this.IDNode().RightSibling !=null;
    }
    public Node IDNode(){
        return this.LeftmostChild;
    }
    public Node ArrayIndexNode(){
        return this.IDNode().RightSibling;
    }


    @Override
    public String toString() {
        return "Ref";
    }
}
