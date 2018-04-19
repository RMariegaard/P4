package other;

import Nodes.ArgumentNode;

import java.util.ArrayList;

public class SymbolClass {
    public String Name;
    public Object type;
    public int Depth;
    public SymbolClass Var;
    public SymbolClass Level;
    public ArgumentNode[] Parameters;
    public ArrayList<String> IDs = new ArrayList<>();
}

