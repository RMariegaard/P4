package AST;

abstract class Node{

    public Node Parent;
    public Node LeftmostSibling;
    public Node RightSibling;
    public Node LeftmostChild;

    public Node(){}

    public void MakeSiblings(){}

    public void AdoptChildren(){}
}