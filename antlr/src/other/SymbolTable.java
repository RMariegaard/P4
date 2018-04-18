package other;
import Nodes.ArgumentNode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
/*
* Se side 192 i creating a compiler.
* */

public class SymbolTable {
    private Hashtable<String, SymbolClass> hashtable = new Hashtable<>();
    private List<SymbolClass> scopeDisplay = new ArrayList<>();
    private int depth;

    public SymbolTable(){

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

    public void EnterSymbol(String name, Object type){
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
        System.out.println(type.toString() + " " + name);


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

    public void EnterSymbol(String name, Object type, ArgumentNode[] parameters){
        EnterSymbol(name, type);
        SymbolClass sym = RetrieveSymbol(name);
        sym.Parameters = parameters;

    }

    public boolean DeclaredLocally(String name){

        if(hashtable.get(name) != null)
            return hashtable.get(name).Depth == depth;
        else
            return false;
    }
}
