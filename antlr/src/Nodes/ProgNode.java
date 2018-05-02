package Nodes;

import java.util.ArrayList;

public class ProgNode extends Node {

    public ProgNode(int firstLinenumber) {
        super(firstLinenumber);
    }

    private ArrayList<MethodNode> listOfMethods = new ArrayList<>();
    private ArrayList<StrategyNode> listOfStrategies = new ArrayList<>();

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
        return listOfStrategies.size();
    }
    public void FindAllStrats(){
        Node node = this.GameLoopNode().RightSibling;
        while ((node instanceof StrategyNode)){
            listOfStrategies.add((StrategyNode) node);
            node = node.RightSibling;
        }
    }
    public ArrayList<StrategyNode> StrategyNodes(){
        return listOfStrategies;
    }
    public void FindAllMethods(){
        Node node = listOfStrategies.get(listOfStrategies.size()-1).RightSibling;
        while (node instanceof MethodNode){
            listOfMethods.add((MethodNode) node);
            node = node.RightSibling;
        }
    }
    public int NumberOfMethods(){
        return listOfMethods.size() -1;
    }


    public ArrayList<MethodNode> MethodNodes(){
        return listOfMethods;
    }


    @Override
    public String toString() {
        return "Prog";
    }


}
