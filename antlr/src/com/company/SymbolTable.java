package com.company;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

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

    public void OpenScope(){
        depth++;
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
        depth--;
    }

    public SymbolClass RetrieveSymbol(String name){
        SymbolClass sym = hashtable.get(name);
        if (sym != null){
            return sym;
        }
        return null; //error symbol not found
    }

    public void EnterSymbol(String name, Type type){
        SymbolClass oldSym = hashtable.get(name);
        if (oldSym != null && oldSym.Depth == depth){
            //ERROR dublikering af navn
        }
        SymbolClass sym = new SymbolClass();

        //Add to scope display
        sym.Level = scopeDisplay.get(depth);
        sym.Name = name;
        sym.Depth = depth;
        scopeDisplay.add(depth, sym);

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
