package Nodes;

import java.util.Set;

public class ProgNode extends Node {

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

    public Node SetupNode(){
        Node[] array = PreDclNodes();
        return array[array.length-1].RightSibling;
    }

    public Node GameLoopNode(){
        return SetupNode().RightSibling;
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

    public Node[] StrategyNodes(){
        Node[] array = new Node[NumberOfStrategies()];
        Node node = this.GameLoopNode();
        for(int i=0; i<array.length; i++){
            array[i] = node;
            node = node.RightSibling;
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

    public Node[] MethodNodes(){
        Node[] array = new Node[NumberOfMethods()];
        Node node = StrategyNodes()[NumberOfStrategies()-1].RightSibling;
        for(int i=0; i<array.length; i++){
            array[i] = node;
            node = node.RightSibling;
        }
        return array;
    }


    @Override
    public String toString() {
        return "Prog";
    }


}
