package Nodes;

public abstract class Node{

    public Node Parent;
    public Node LeftmostSibling;
    public Node RightSibling;
    public Node LeftmostChild;
    public int Distance;

    public int FirstLinenumber;
    public Object Type;
    public boolean ErrorFlag = false;



    public Node(int firstLinenumber){
        this.FirstLinenumber = firstLinenumber;
    }

    public Node MakeSiblings(Node y){

        Node xSibs;
        if (RightSibling != null) {
            xSibs = RightSibling;
            while(xSibs.RightSibling != null){
                xSibs = xSibs.RightSibling;
            }
        }
        else
            xSibs = this;

        Node ySibs = y.LeftmostSibling;
        xSibs.RightSibling = ySibs;

        ySibs.LeftmostSibling = xSibs.LeftmostSibling;
        ySibs.Parent = xSibs.Parent;
        while(ySibs.RightSibling != null){
            ySibs = ySibs.RightSibling;
            ySibs.LeftmostSibling = xSibs.LeftmostSibling;
            ySibs.Parent = xSibs.Parent;
        }
        return ySibs;
    }

    public Node AdoptChildren(Node y) {
        Node ySibs;
        if(y.LeftmostSibling == null)
            y.LeftmostSibling = y;
        if (this.LeftmostChild != null)
            this.LeftmostChild.MakeSiblings(y);
        else {
            ySibs = y.LeftmostSibling;
            this.LeftmostChild = ySibs;
            while (ySibs != null) {
                ySibs.Parent = this;
                ySibs = ySibs.RightSibling;
            }
        }
        return this;
    }

    public Node AdoptChildren(Node... ys){
        for (Node y: ys) {
            AdoptChildren(y);
        }
        return this;
    }



    public Node makeNode(){
        return this;
    }

    public Node MakeFamily( Node... kids){

        for(int i = 0; i<kids.length; i++) {
            kids[0].MakeSiblings(kids[i+1]);
        }

        return makeNode().AdoptChildren(kids[0]);
    }

    @Override
    public String toString() {
        return "Node";
    }
}


