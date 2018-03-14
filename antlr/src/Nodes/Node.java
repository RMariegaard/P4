package Nodes;

public abstract class Node{

    public Node Parent;
    public Node LeftmostSibling;
    public Node RightSibling;
    public Node LeftmostChild;

    public Node(){}


    //Ifølge bogen skal de alle sammen returnere node...
    public Node MakeSiblings(Node y){
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
        return ySibs;

    }

    //Ifølge bogen skal de alle sammen returnere node... Her siger de ikke hvad der skal returneres.
    public Node AdoptChildren(Node y) {
        Node ySibs;
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
        return this;   //idk hvad man skal returnere
    }






    //Forstår ikke helt de to næste functioner.. skal de overhoved være her?


    //Er vel bare constructeren som jo skal være specifict vel?
    public Node makeNode(){
        return this;
    }


    //Ifølge bogen skal den kaldes udefra med en parameter op hvor makeNode(op).AdoptChildren bliver kaldt på
    //Men det her er vel det samme??


    //Fuck nu det her. syntes ikke det giver mening
    public Node MakeFamily( Node... kids){

        for(int i = 0; i<kids.length; i++) {
            kids[0].MakeSiblings(kids[i+1]);
        }

        return makeNode().AdoptChildren(kids[0]);
    }
}


