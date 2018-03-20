package com.company;
import Nodes.Node;
import sun.misc.Queue;

public class ASTPrinter {
    //virker ikke endnu
    public static void PrintTree(Node ast){


        Queue<Node> q = new Queue<>();
        ast.Distance = 0;
        int lastD = 0;
        q.enqueue(ast);
        try {
            while(!q.isEmpty()){
                Node n = q.dequeue();
                if(n.Distance != lastD){
                    System.out.println();
                    lastD = n.Distance;
                }
                System.out.print(n + "  ");

                if(n.LeftmostChild != null){
                    Node v = n.LeftmostChild;
                    v.Distance = n.Distance + 1;

                    do{
                        q.enqueue(v);
                        v = v.RightSibling;
                        if(v != null)
                            v.Distance = n.Distance + 1;
                    }while (v != null);
                }
            }

        }
        catch (java.lang.InterruptedException e){
            System.out.println("error in printing");
        }
        System.out.println();
    }

}
