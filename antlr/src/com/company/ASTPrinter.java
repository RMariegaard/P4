package com.company;
import Nodes.Node;

public class ASTPrinter {
    //virker ikke endnu
    public static void PrintTree(Node ast){

        System.out.println(ast);
        if(ast.LeftmostChild != null){
            ast = ast.LeftmostChild;
            System.out.print(ast);
            while(ast.RightSibling != null){
                ast = ast.RightSibling;
                System.out.print("  " + ast);
            }
        }

    }
}
