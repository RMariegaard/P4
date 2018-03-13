

abstract class Node{

    public Node Parent;
    public Node LeftmostSibling;
    public Node RightSibling;
    public Node LeftmostChild;

    public Node(){}

    public void MakeSiblings(Node y){
        Node xSibs = RightSibling;
        while(xSibs.RightSibling != null){
            xSibs = xSibs.RightSibling;
        }
        Node ySibs = y.LeftmostSibling;
        xSibs.RightSibling = ySibs;

        ySibs.LeftmostSibling = xSibs.LeftmostSibling;
        ySibs.Parent = xSibs.Parent;
        while(ySibs.RightSibling != null){
            ySibs = ySibs.RightSibling;
            ySibs.LeftmostSibling = xSibs.LeftmostSibling;
            ySibs.Parent = xSibs.Parent;
        }

    }
    public void AdoptChildren(Node y) {
        if (this.LeftmostChild != null)
            this.LeftmostChild.MakeSiblings(y);
        else {
            Node ySibs = y.LeftmostSibling;
            this.LeftmostChild = ySibs;
            while (ySibs != null) {
                ySibs.Parent = this;
                ySibs = ySibs.RightSibling;
            }
        }
    }
    //Er vel bare constructeren som jo skal være specifict vel?
    public void makeNode(){}


    //Ifølge bogen skal den kaldes udefra med en parameter op hvor makeNode(op).AdoptChildren bliver kaldt på
    //Men det her er vel det samme??
    public void MakeFamily(Node... kids){
            for(int i = 0; i<kids.length; i++) {
                kids[i].MakeSiblings(kids[i+1]);
            }
            AdoptChildren(kids[0]);
        }

    }
}