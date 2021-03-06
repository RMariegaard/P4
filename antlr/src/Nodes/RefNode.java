package Nodes;

import Nodes.values.IDNode;

public class RefNode extends Node {

    public RefNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public boolean IsArrayRef(){
        return this.IDNode().RightSibling !=null;
    }
    public IDNode IDNode(){
        return (IDNode)this.LeftmostChild;
    }
    public Node ArrayIndexNode(){
        return this.IDNode().RightSibling;
    }


    @Override
    public String toString() {
        return "Ref";
    }
}
