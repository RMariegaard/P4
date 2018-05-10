package other;

import Nodes.Node;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
/*
* Se side 192 i creating a compiler.
* */

public class SymbolTable {
    //This hashtable includes a list of all variables(SymbolClass) in the language, no matter the scope
    //However, if there excist more than one variable with the same name, only the outermost variable will be in the hashtable
    //and then this variable will have a reference to the next variable with the same name.
    private Hashtable<String, SymbolClass> hashtable = new Hashtable<>();

    //Scopedisplay is a list that reprecent the variables split into different lvl's of scopes. so this list only contain one variable from each scope lvl,
    //and then this variable has a reference to the next variable in the same scope lvl, and so on. So only the last declared variable of each scopelvl is necessesary in the scopeDisplay
    private List<SymbolClass> scopeDisplay = new ArrayList<>();
    //Int that reprecents the current scope lvl.
    private int depth = 0;

    public SymbolTable(){
        scopeDisplay.add(null);
    }
    public void OpenScope(){
        depth++;
        scopeDisplay.add(depth, null);
    }

    public void CloseScope(){
        //First we use the scope display to retrieve the last symbol in this scope level.
        SymbolClass sym = scopeDisplay.get(depth);
        scopeDisplay.remove(depth); //delete it from the scopedisplay also, which clear this lvl completely.
        //Going through each element in this scopelevel to also remove them from the hashtable
        while(sym != null){
           //If there excist another variable with the same name, but in a lower scope lvl, the symbol has a reference to that variable also.
            SymbolClass prevsym = sym.Var;
            hashtable.remove(sym.Name); //remove the symbol in the hashtable, by finding the symbol with that name.

            if(prevsym != null){ //if there was another variable with the same name declared, this will now be put into the hashtable instead.
                hashtable.put(prevsym.Name, prevsym); //using the name of the variable as the hash.
            }
            //The sym has a reference (Level) to the next symbol in the table at the same lvl, like a list, which can be used to find all the symbols at this lvl.
            sym = sym.Level;
        }
        //finally the depth will be decreased.
        depth = depth > 0 ? depth - 1 : 0;
    }

    public SymbolClass RetrieveSymbol(String name){
        //Retrieve the symbol by looking up the name.
        //Notice we have static scoping, and therefore the hashtable only contains the last declared variable of that name
        //and this is the variable that will be returned.
        SymbolClass sym = hashtable.get(name);
        if (sym != null){
            return sym;
        }
        //The typechecker should check if the retreived symbol is null, and therefore an error will not be added here.
        return null; //error symbol not found
    }

    public void EnterSymbol(String name, Node node){
        //Creating a new SymbolClass to reprecent the new variable.
        SymbolClass sym = new SymbolClass();

        //Add to scope display
        //If the scope display is not empty, then we have to remove the currently located variable, and put it as a reference in the newly created variable(sym).
        //Since scope display should only keep one variable from each scope lvl.
        if(!scopeDisplay.isEmpty()){
            sym.Level = scopeDisplay.get(depth);
            scopeDisplay.remove(depth);
        }
        //Give the attributes to the new variable.
        sym.Name = name;
        sym.Depth = depth;
        sym.Node = node;
        scopeDisplay.add(depth, sym);   //Then we add it to the scope display

        //Add to hash

        //The typechecker is checking if the variable already excist in the same scope lvl
        //Therefore oldSym will always be from a lower scope lvl, and the new sym should therefore have a reference to oldSym.
        SymbolClass oldSym = hashtable.get(name);
        if (oldSym == null){//If there does not excist a variable with same name, we just add it to the hashtable
            hashtable.put(sym.Name, sym);
        }
        else {
            //If such a variable with the same name excist, we first have to remove it from the hashtable, and then add our new variable
            hashtable.remove(oldSym.Name);
            hashtable.put(sym.Name, sym);
        }//and the we can give a reference to the old variable to our new variable, or null, if oldSym does not excist.
        sym.Var = oldSym;
    }


    public boolean DeclaredLocally(String name){
        //First we check if there excist such a variable with the specified name
        if(hashtable.get(name) != null)
            return hashtable.get(name).Depth == depth; //Then we have to check if it already excist in this scope, so we can give an error in the typechecker.
        else                                            //Since it's no problem to have a variable with the same name in another scope, static checking...
            return false; //else we just return false.
    }
}
