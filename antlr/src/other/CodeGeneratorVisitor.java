package other;

import Nodes.*;
import Nodes.expr.*;
import Nodes.values.*;

public class CodeGeneratorVisitor extends AstVisitor<String> {

    public String Code;

    @Override
    public String Visit(ActionNode node) {
        String string = "";
        for(Node idnode : node.IDNodes())
            string = String.format(string + "%s.", Visit(idnode));
        return string + Visit(node.Fcall());
    }

    @Override
    public String Visit(AddExprNode node) {
        return String.format("(%s) + (%s)", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(AndNode node) {
        return String.format("%s && %s", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(ArgumentNode node) {
        return String.format("%s %s", node.Type.toString(), Visit(node.RefNode()));
    }

    @Override
    public String Visit(ArrayExprNode node) {
        return String.format("%s[%s]", Visit(node.ExprNode()), Visit(node.IDNode()));
    }

    @Override
    public String Visit(AssignNode node) {
        return String.format("%s = %s;", Visit(node.RefNode()), Visit(node.ValueNode()));
    }

    @Override
    public String Visit(BehaviorNode node) {
        return null;
    }

    @Override
    public String Visit(BlockNode node)
    {
        String result = "";
        for (int i = 0; i < node.NumberOfStatements(); i++)
        {
            result = String.format(result + Visit(node.StmtNodes()[i]) + "\n");
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
        if (node.ChildNode().RightSibling == null)
        {
            return String.format("%s %s;", node.Type, node.getID()); //burde ikke bare være visit(childnode)
        }
        else
        {
            return String.format("%s %s = %s;", node.Type, node.getID(), Visit(node.ChildNode().RightSibling));
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
        return String.format("for(%s = %s; %s < %s; %s = %s + %s){%s}"
                , Visit(node.VariableNode()), Visit(node.StartValueNode()), Visit(node.VariableNode()), Visit(node.EndValueNode())
                , Visit(node.VariableNode()), Visit(node.VariableNode()), Visit(node.IncrementNode()), Visit(node.BlockNode()));
    }

    @Override
    public String Visit(ElseNode node)
    {
        return String.format("else { %s }", Visit(node.Block()));
    }

    @Override
    public String Visit(ElseIfNode node) {
        return String.format("else if(%s){ %s }", Visit(node.Condition()), Visit(node.Block()));
    }

    @Override
    public String Visit(EqualNode node) {
        return String.format("%s == %s", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(EventNode node) {
        return null;
    }

    @Override
    public String Visit(FcallNode node) { return null;}

    @Override
    public String Visit(GameLoopNode node) {
        return null;
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
        return null;
    }

    @Override
    public String Visit(IfStmtNode node) {
        String result = String.format("if (%s){%s}", node.Condition(), node.Block());
        for (int i = 0; i < node.NumberOfElseIf(); i++){
            result = result + Visit(node.ElseIf()[i]);
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
        return null;
    }

    @Override
    public String Visit(MulExprNode node) {
        return null;
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
        return String.format("%s || &s", Visit(node.LeftNode()), Visit(node.RightNode()));
    }

    @Override
    public String Visit(ProgNode node) {
        String string = "";


        for(Node pnode : node.PreDclNodes())
            string += Visit(pnode);
        string += "public void run() {\n";
        string += Visit(node.SetupNode());
        string += "while(true) {\n";
        string += Visit(node.GameLoopNode());
        string += "}\n";

        for(Node mnode : node.MethodNodes())
            string += Visit(mnode);

        String strategies = "";
        //Der skal laves nye filer
        for(Node snode : node.StrategyNodes()){
            strategies += Visit(snode);
        }

        MakeRobotClass(string, strategies);

        return string;
    }

    //The code has all imported libaries.
    private String MakeRobotClass(String code, String strategies) {
        String string = "";
        string += ImportLibaries(strategies);
        return null;
        //TODO: det giver ingen mening det her. Return null???
    }

    private String ImportLibaries(String strategies) {
        return null;
    }

    @Override
    public String Visit(RTypeNode node) {
        return null;
    }

    @Override
    public String Visit(ReturnStmtNode node)
    {
        return String.format("return %s", Visit(node.ExprNode()));
    }

    @Override
    public String Visit(RefNode node) {
        return null;
    }

    @Override
    public String Visit(SetupNode node) {
        return null;
    }

    @Override
    public String Visit(StrategyNode node) {
        return null;
    }

    @Override
    public String Visit(StringNode node)
    {
        return node.value;
    }

    @Override
    public String Visit(SubExprNode node) {
        return null;
    }

    @Override
    public String Visit(UsubNode node) {
        return null;
    }

    @Override
    public String Visit(UAddNode node) {
        return null;
    }

    @Override
    public String Visit(WhileStmtNode node)
    {
        return String.format("while(%s){ %s }", Visit(node.ConditionNode()), Visit(node.BlockNode()));
    }
}
