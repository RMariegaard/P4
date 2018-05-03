package other;

import Nodes.*;
import Nodes.expr.*;
import Nodes.values.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodeGeneratorVisitor extends AstVisitor<String> {

    public String Code = "";
    private ArrayList<String> listOfCustomEvent = new ArrayList<>();
    private ArrayList<APIevents> listOfAPIEvents = new ArrayList<>();
    private ArrayList<APIMethods> listOfAPIMethods = new ArrayList<>();
    private String currentEvent;
    int tabIndex = 0;


    public CodeGeneratorVisitor(ArrayList<APIevents> list, ArrayList<APIMethods> listMethods){
        listOfAPIEvents = list;
        listOfAPIMethods = listMethods;
    }
    public CodeGeneratorVisitor(){
    }

    private String AddTabs(){
        String string ="";
        for (int i = 0; i< tabIndex; i++){
            string += "    ";
        }
        return string;
    }

    @Override
    public String Visit(ActionNode node) {
        String string = "";
        return  Visit(node.Fcall());
    }

    @Override
    public String Visit(AddExprNode node) {
        return String.format("%s + %s", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(AndNode node) {
        return String.format("(%s) && (%s)", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(ArgumentNode node) {
        return String.format("%s %s", getType(node.Type), Visit(node.RefNode()));
    }

    @Override
    public String Visit(ArrayExprNode node) {
        return String.format("%s[%s]", Visit(node.IDNode()), Visit(node.ExprNode()));
    }

    @Override
    public String Visit(AssignNode node) {
        return String.format("%s = %s", Visit(node.RefNode()), Visit(node.ValueNode()));
    }

    @Override
    public String Visit(BehaviorNode node) {
        String behavior = "";
        behavior += Visit(node.BlockNode());
        return behavior;
    }
    @Override
    public String Visit(BlockNode node)
    {
        String result = "";
        for (int i = 0; i < node.NumberOfStatements(); i++)
        {
            Node stmt = node.StmtNodes()[i];
            if(stmt instanceof IfStmtNode || stmt instanceof WhileStmtNode || stmt instanceof DoStmtNode)
                result = String.format(result + AddTabs() + Visit(stmt) + "\n");
            else
                result = String.format(result + AddTabs() + Visit(stmt) + ";\n");
        }
        return result;
    }

    @Override
    public String Visit(BoolNode node)
    {
        return String.format("%s", node.value);
    }

    @Override
    public String Visit(DclNode node)
    {
        if (node.ChildNode().LeftmostChild.RightSibling == null)
        {
            return String.format("%s %s", node.Type, node.getID()); //burde ikke bare være visit(childnode)
        }
        else
        {
            return String.format("%s %s = %s", node.Type, node.getID(), Visit(node.ChildNode().LeftmostChild.RightSibling));
        }
    }

    @Override
    public String Visit(DecimalNode node) {
        return String.format("%s", node.value);
    }

    @Override
    public String Visit(DivExprNode node) {
        return String.format("%s/%s", node.LeftNode(), node.RightNode());
    }

    @Override
    public String Visit(DoStmtNode node)
    {
        String string = String.format("for (%s = %s; %s <= %s; %s += %s) {\n",Visit(node.VariableNode()), Visit(node.StartValueNode()), node.VariableNode().RefNode().IDNode().toString(), Visit(node.EndValueNode())
                ,node.VariableNode().RefNode().IDNode().toString(),  Visit(node.IncrementNode()));
        tabIndex++;
        string += String.format("%s", Visit(node.BlockNode()));
        tabIndex--;
        string += AddTabs() + "}";
        return string;
    }

    @Override
    public String Visit(ElseNode node)
    {
        String string = "";
        string += "else{\n";
        tabIndex++;
        string += String.format("%s", Visit(node.Block()));
        tabIndex--;
        string += AddTabs() + "}\n";
        return string;
    }

    @Override
    public String Visit(ElseIfNode node) {
        String string = "";
        string += String.format("else if(%s){\n",Visit(node.Condition()));
        tabIndex++;
        string += String.format("%s", Visit(node.Block()));
        tabIndex--;
        string += AddTabs() + "}\n";
        return string;
    }

    @Override
    public String Visit(EqualNode node) {
        if(node.Type == String.class){
            return String.format("%s.equals(%s)", Visit(node.LeftNode()), Visit(node.RightNode()) );
        }
        return String.format("%s == %s", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(EventNode node) {
        String eventDcl;
        String name = Visit(node.ID());
        eventDcl = String.format("Condition %s = new Condition(\"%s\")", name,name);
        eventDcl += "\n" + AddTabs() +"{";
        tabIndex++;
        eventDcl += "\n" + AddTabs() + "public boolean test() \n";
        eventDcl += AddTabs()+ "{\n";
        tabIndex++;
        eventDcl += String.format(AddTabs() + "return (%s);\n", Visit(node.ExprNode()));
        tabIndex--;
        eventDcl += AddTabs() + "}\n";
        tabIndex--;
        eventDcl += AddTabs() + "};\n";

        listOfCustomEvent.add(String.format("%s",name));
        return eventDcl;
    }

    @Override
    public String Visit(FcallNode node) {
        List<String> colorFunctions = Arrays.asList("Tank.Gun.setColor", "Tank.setBodyColor", "Tank.Radar.setColor");
        //Den første if checker om det er en af de tre functioner hvor vi bruger farver, dette er nemmelig lidt specielt
        //Her skal man nemlig printe Color.farve, men i DYER angiver man farven som en string, hvilket tegnet " ikke skal printes i java.
        if(colorFunctions.contains(node.IDNode().idString)){
            return String.format("%s(Color.%s)", Visit(node.IDNode()), node.ArgumentNodes()[0].toString());
        }
        else if(node.NumberOfArguments() == 0)
            return String.format("%s()", Visit(node.IDNode()));
        else if (node.NumberOfArguments() == 1)
            return String.format("%s(%s)", Visit(node.IDNode()), Visit(node.ArgumentNodes()[0]));
        else{
            String Fcall = String.format("%s(", Visit(node.IDNode()));
            Node[] array = node.ArgumentNodes();
            for(int i = 0; i < node.NumberOfArguments() - 1; i++){
                Fcall = String.format(Fcall + "%s,",Visit(array[i]));
            }
            Fcall = String.format(Fcall + "%s)", Visit(array[array.length]));
            return Fcall;
        }
    }

    @Override
    public String Visit(GameLoopNode node) {
        return String.format("%s",Visit(node.Block()));
    }

    @Override
    public String Visit(GreaterNode node)
    {
        return String.format("%s > %s", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(GreaterEqualNode node)
    {
        return String.format("%s >= %s", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(IDNode node) {
        APIMethods test = new APIMethods();
        test.DYERname = node.toString();
        if(listOfAPIMethods.contains(test)){
            int index = listOfAPIMethods.indexOf(test);
            String APIname = listOfAPIMethods.get(index).APIname;
            return APIname;
        }
        else
            return String.format("%s", node.idString);
    }


    @Override
    public String Visit(IfStmtNode node) {
        String result = String.format("if (%s){ \n",Visit(node.Condition()));
        tabIndex++;
        result += String.format("%s", Visit(node.Block()));
        tabIndex--;
        result += AddTabs() + "}\n";
        for (int i = 0; i < node.NumberOfElseIf(); i++){
            result += AddTabs() + Visit(node.ElseIf()[i]);
        }
        return result;
    }


    @Override
    public String Visit(IntNode node) {
        return String.format("%s", node.value);
    }

    @Override
    public String Visit(LessEqualNode node)
    {
        return String.format("%s <= %s", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(LessNode node)
    {
        return String.format("%s < %s", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(MethodNode node) {
        String string = "";
        int parametersdone = 0;
        string += String.format(AddTabs() + "public %s %s(", node.RTypeNode(), node.IDNode());
        //TODO: hvad hvis der ikke er nogen parametre, hvirker det stadig`?
        for( ArgumentNode parameter : node.Parameters() ){
            if(parametersdone + 1 == node.NumberOfParameters()){
                string = String.format(string + "%s){\n", Visit(parameter));
            }
            else {
                string = String.format(string + "%s, ", Visit(parameter));
            }
            parametersdone++;
        }
        tabIndex++;
        string += String.format("%s", Visit(node.BlockNode()));
        tabIndex--;
        string += AddTabs() + "}\n";
        return string;
    }

    @Override
    public String Visit(MulExprNode node) {
        return String.format("%s * %s", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(NotExprNode node)
    {
        return String.format("!(%s)", Visit(node.ExprNode()));
    }

    @Override
    public String Visit(NullNode node) {
        return "null";
    }

    @Override
    public String Visit(OrNode node) {
        return String.format("(%s) || (&s)", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(ProgNode node) {
        String string = "";

        string += "import robocode.*;\n";
        string += "import java.awt.*;\n";

        string += "public class ThisRobot extends AdvancedRobot{\n"; //Start class
        tabIndex++;
        for(Node pnode : node.PreDclNodes()) {
            if(pnode instanceof EventNode)
                string += AddTabs() + Visit(pnode);
            else
                string += AddTabs() + Visit(pnode) + ";\n";
        }
        string += AddTabs() + "String strategy = \"Default\";\n";
        string += AddTabs() + "public void run() {\n";
        tabIndex++;
        for (String customEvent: listOfCustomEvent) {
            string += String.format(AddTabs() + "addCustomEvent(%s);\n", customEvent);
        }
        string += Visit(node.SetupNode());
        string += AddTabs() + "while(true) {\n";
        tabIndex++;
        string +=  Visit(node.GameLoopNode());
        tabIndex--;
        string += AddTabs() + "}\n";
        tabIndex--;
        string += AddTabs() + "}\n";

        for(Node mnode : node.MethodNodes())
            string += Visit(mnode);

        string += "\n";
        string += AddTabs() +"public void onCustomEvent(CustomEvent e){ \n"; //First we make a specific event
        for(String customEvent: listOfCustomEvent){ //All our custom events are called in this specific method in Java
            tabIndex++;
            currentEvent = customEvent; //setting this variable, so we can use it when visiting the strategies
            string += String.format(AddTabs() + "if(e.getCondition() == %s){\n", customEvent); //Going through all the custom events
            tabIndex++;
            for(Node strat: node.StrategyNodes()){ //Visiting each strategy, to check if they have some behavior at this event.
                string += Visit(strat);
            }
            tabIndex--;
            string += AddTabs() + "}\n";
        }
        tabIndex--;
        string += AddTabs() + "}\n";
        //Going through the rest of the events from robocodeAPI:
        for(APIevents event: listOfAPIEvents){
            string += String.format(AddTabs() + "public void %s(%s e){\n", event.name, event.EventArg);
            currentEvent = event.name;
            tabIndex++;
            for(Node strat: node.StrategyNodes()){ //Visiting each strategy, to check if they have some behavior at this event.
                string += Visit(strat);
            }
            tabIndex--;
            string += AddTabs() + "}\n";
        }

        string += "}"; //end class
        return string;
    }

    //The code has all imported libaries.
    private String MakeRobotClass(String code, String strategies) {
        String string = "";
        string += ImportLibaries(strategies);
        return null;
    }

    private String ImportLibaries(String strategies) {
        return null;
    }

    @Override
    public String Visit(RTypeNode node) {
        return node.toString();
    }

    @Override
    public String Visit(ReturnStmtNode node)
    {
        return String.format("return %s", Visit(node.ExprNode()));
    }

    @Override
    public String Visit(RefNode node) {
        if(node.IsArrayRef()){
            //forstår ikke helt det med isarrayref siger den aldrig bliver brugt ?
            return String.format("%s",Visit(node.IDNode()));
        }
        else {
           return String.format("%s", Visit(node.IDNode()));
        }
    }

    @Override
    public String Visit(SetupNode node) {
        return String.format("%s", Visit(node.BlockNode()));
    }

    @Override
    public String Visit(StrategyNode node) {
        String string = "";
        for(BehaviorNode bnode: node.BehaviourNodes()){
            if(bnode.IDNode().toString().equals(currentEvent)){
               string += String.format(AddTabs() + "if(strategy.equals(\"%s\")){\n",node.IDNode().toString());
               tabIndex++;
               string += Visit(bnode);
               tabIndex--;
               string += AddTabs() + "}\n";
            }
        }
        return string;
    }

    @Override
    public String Visit(StringNode node)
    {
        return String.format("\"%s\"",node.value);
    }

    @Override
    public String Visit(SubExprNode node) {
        return String.format("%s - %s", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(UsubNode node) {
        return String.format("%s--",Visit(node.RefNode()));
    }

    @Override
    public String Visit(UAddNode node) {
        return String.format("%s++",Visit(node.RefNode()));
    }

    @Override
    public String Visit(WhileStmtNode node)
    {
        return String.format("while(%s){ %s }", Visit(node.ConditionNode()), Visit(node.BlockNode()));
    }

    private String getType(Object type){
        if(type == String.class)
            return "string";
        else
            return type.toString();
    }
}
