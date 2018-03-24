package com.company;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import Nodes.*;
import jdk.nashorn.internal.ir.Block;
/*
* Der mangler en fucking masse...
* Kan ikke lige finde ud af det så det må i gerne..
* Se side 192 i creating a compiler.
* */

public class SymbolTable {
    private Hashtable<String, SymbolClass> hashtable = new Hashtable<>();
    private List<SymbolClass> scopeDisplay = new ArrayList<>();
    private int depth;

    public SymbolTable(){

    }

    public void BuildTable(Node root){
        Node node = root.LeftmostChild;
        //process predcls
        while(!(node instanceof SetupNode)){
            ProcessNode(node);
            node = node.RightSibling;
        }
        //find first method block
        Node method = node;
        while(!(method instanceof MethodNode)){
            method = method.RightSibling;
           if(method == null){
                break;
            }
        }
        //process Method nodes without setup
        while(method != null){
            if(method instanceof MethodNode){
                ProcessNode(method);
            }
            method = method.RightSibling;
        }

        while(node != null){
            if(!(node instanceof MethodNode)){
                ProcessNode(node);
            }
            node = node.RightSibling;
        }






    }

    private void ProcessNode(Node node) {
         if(node instanceof BlockNode){
             this.OpenScope();
         }
         else if(node instanceof DclNode){
             this.EnterSymbol(node.LeftmostChild.LeftmostChild.LeftmostChild.toString(), ((DclNode) node).Type); //dcl -> assig/ref -> ID

         }
         else if(node instanceof RefNode) {
             SymbolClass sym = this.RetrieveSymbol(node.LeftmostChild.toString()); //ref -> ID
             if (sym == null) {
                 //error undeclared
             }
         }
         else if(node instanceof EventNode){
             this.EnterSymbol(node.LeftmostChild.RightSibling.toString(), "Event");
         }
         else if(node instanceof StrategyNode){
             this.EnterSymbol(node.LeftmostChild.toString(), "Strategy");

         }
         else if(node instanceof MethodNode){
             this.EnterSymbol(node.LeftmostChild.toString(), "Method");
         }

         Node c = node.LeftmostChild;
         while(c != null){
             ProcessNode(c);
             c = c.RightSibling;
         }
         if(node instanceof BlockNode){
             this.CloseScope();
         }

    }


    public void OpenScope(){
        depth = depth > 0 ? depth + 1 : 0;
        scopeDisplay.add(depth, null);
    }

    public void CloseScope(){
        SymbolClass sym = scopeDisplay.get(depth);
        while(sym != null){
            SymbolClass prevsym = sym.Var;

            hashtable.remove(sym);
            if(prevsym != null){
                hashtable.put(sym.Name, sym);
            }
            sym = sym.Level;
        }
        depth = depth > 0 ? depth - 1 : 0;
    }

    public SymbolClass RetrieveSymbol(String name){
        SymbolClass sym = hashtable.get(name);
        if (sym != null){
            return sym;
        }
        return null; //error symbol not found
    }

    public void EnterSymbol(String name, String type){
        SymbolClass oldSym = hashtable.get(name);
        if (oldSym != null && oldSym.Depth == depth){
            //ERROR dublikering af navn
        }
        SymbolClass sym = new SymbolClass();

        //Add to scope display
        if(!scopeDisplay.isEmpty()){
        sym.Level = scopeDisplay.get(depth);}
        sym.Name = name;
        sym.Depth = depth;
        sym.type = type;
        scopeDisplay.add(depth, sym);

        //prints to console
        System.out.println(type + " " + name);


        //Add to hash
        if (oldSym == null){
            hashtable.put(sym.Name, sym);
        }
        else {
            hashtable.remove(oldSym.Name);
            hashtable.put(sym.Name, sym);
        }
        sym.Var = oldSym;
    }

    public boolean DeclaredLocally(String name){
        return hashtable.get(name).Depth == depth;

    }

}
