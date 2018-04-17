package Nodes;

public class ProgNode extends Node {

    public ProgNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    public int NumberOfPreDcls(){
        int result = 0;
        Node node = this.LeftmostChild;
        while(!(node instanceof SetupNode)) {
            result++;
            node = node.RightSibling;
        }
        return result;
    }

    public Node[] PreDclNodes(){
        Node[] array = new Node[NumberOfPreDcls()];
        Node node = this.LeftmostChild;
        for(int i=0; i<array.length; i++){
            array[i] = node;
            node = node.RightSibling;
        }
        return array;
    }

    public SetupNode SetupNode(){
        Node[] array = PreDclNodes();
        return (SetupNode) array[array.length-1].RightSibling;
    }

    public GameLoopNode GameLoopNode(){
        return (GameLoopNode) SetupNode().RightSibling;
    }

    public int NumberOfStrategies(){
        int result = 0;
        Node node = this.GameLoopNode().RightSibling;
        while(node instanceof StrategyNode) {
            result++;
            node = node.RightSibling;
        }
        return result;
    }

    public StrategyNode[] StrategyNodes(){
        StrategyNode[] array = new StrategyNode[NumberOfStrategies()];
        StrategyNode node = (StrategyNode) this.GameLoopNode().RightSibling;
        for(int i=0; i<array.length; i++){
            array[i] = node;
            node = (StrategyNode) node.RightSibling;
        }
        return array;
    }

    public int NumberOfMethods(){
        int result = 0;
        Node[] array = PreDclNodes();
        Node node = array[array.length-1].RightSibling;
        while(node instanceof MethodNode){
            result++;
            node = node.RightSibling;
        }
        return result;
    }

    public MethodNode[] MethodNodes(){
        MethodNode[] array = new MethodNode[NumberOfMethods()];
        MethodNode node = (MethodNode) StrategyNodes()[NumberOfStrategies()-1].RightSibling;
        for(int i=0; i<array.length; i++){
            array[i] = node;
            node = (MethodNode) node.RightSibling;
        }
        return array;
    }


    @Override
    public String toString() {
        return "Prog";
    }


}
