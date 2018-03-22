package com.company;
import java.lang.reflect.Type;
import java.util.Hashtable;

/*
* Der mangler en fucking masse...
* Kan ikke lige finde ud af det så det må i gerne..
* Se side 192 i creating a compiler.
* */

public class SymbolTable {
    private Hashtable<String, SymbolClass> hashtable = new Hashtable<>();
    private int depth;

    public SymbolTable(){

    }

    public void OpenScope(){
        depth++;
        //scopeDisplay[depth] = null;
    }

    public void CloseScope(){

    }

    public SymbolClass RetrieveSymbol(String name){
        SymbolClass sym = hashtable.get(name);
        if (sym != null){
            return sym;
        }
        return null;
    }

    public void EnterSymbol(String name, Type type){
        SymbolClass oldSym = hashtable.get(name);
        if (oldSym != null && oldSym.Depth == depth){
            //ERROR dublikering af navn
        }
        SymbolClass sym = new SymbolClass();

        //Add to scope display
        //sym.Level = scopeDisplay[depth];
        sym.Name = name;
        sym.Depth = depth;

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
        return false; //Ikke lavet endnu, se side 292 i crafting a compiler.
    }

}
