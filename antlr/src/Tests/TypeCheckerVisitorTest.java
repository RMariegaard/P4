package Tests;

import Nodes.*;
import Nodes.expr.AddExprNode;
import Nodes.expr.ArrayExprNode;
import Nodes.expr.DivExprNode;
import Nodes.values.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import other.SymbolClass;
import other.TypeCheckerVisitor;

import static org.junit.Assert.*;


class TypeCheckerVisitorTest {
    TypeCheckerVisitor typeChecker;

    @BeforeEach
    void setUp() {
         typeChecker = new TypeCheckerVisitor();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void visitAction() {
        //TODO: this one
    }

    @Test
    void visitAddExprIntAndDecimal() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new IntNode(0,3), new DecimalNode(0,2.2));
        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }

    @Test
    void visitAddExprIntAndInt() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new IntNode(0,3), new IntNode(0,2));
        typeChecker.Visit(node);
        assertSame(int.class, node.Type);
    }
    @Test
    void visitAddExprDecimalAndDecimal() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new DecimalNode(0,2.5), new DecimalNode(0,11.2));

        assertSame( double.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitAddExprStringAndString() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new StringNode(0,"One String"));
        node.AdoptChildren(new StringNode(0,"Two String"));

        //Skal vi kunne gøre dette? så brug
        //assertSame(typeChecker.Visit(node), String.class);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitAddExprBoolAndBool() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new BoolNode(0,true));
        node.AdoptChildren(new BoolNode(0,true));

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }

    @Test
    void visitAndWithBools() {
        Node node = new AndNode(0);
        node.AdoptChildren(new BoolNode(0,true));
        node.AdoptChildren(new BoolNode(0,true));

        assertSame( boolean.class, typeChecker.Visit(node).Type);
    }

    @Test
    void visitAndWithError() {
        Node node = new AndNode(0);
        node.AdoptChildren(new IntNode(0,12));
        node.AdoptChildren(new BoolNode(0,true));
        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }

    @Test
    void visitArgumentDublicateInSymbolTable() {
        Node node = new ArgumentNode(0, "int");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);

        Node intNode = new IntNode(3,0);
        intNode.Type = int.class;
        typeChecker.symbolTable.EnterSymbol("Lars", intNode);
        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }

    @Test
    void visitArgumentWithIntIsInSymbolTable() {
        Node node = new ArgumentNode(0, "int");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);
        typeChecker.Visit(node);

        SymbolClass symbolClass = typeChecker.symbolTable.RetrieveSymbol("Lars");
        assertNotNull(symbolClass);
    }
    @Test
    void visitArgumentWithIntIsTypeInt() {
        Node node = new ArgumentNode(0, "int");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);
        typeChecker.Visit(node);

        SymbolClass symbolClass = typeChecker.symbolTable.RetrieveSymbol("Lars");
        assertSame(int.class,symbolClass.Node.Type);
    }
    @Test
    void visitArgumentWithDecimalIsInSymbolTable() {
        Node node = new ArgumentNode(0, "decimal");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);

        typeChecker.Visit(node);

        SymbolClass symbolClass = typeChecker.symbolTable.RetrieveSymbol("Lars");
        assertNotNull(symbolClass);
    }
    @Test
    void visitArgumentWithDecimalIsCorrectType() {
        Node node = new ArgumentNode(0, "decimal");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);

        typeChecker.Visit(node);

        SymbolClass symbolClass = typeChecker.symbolTable.RetrieveSymbol("Lars");
        assertSame(double.class,symbolClass.Node.Type);
    }
    @Test
    void visitArgumentWithBoolIsInSymbolTable() {
        Node node = new ArgumentNode(0, "bool");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);

        typeChecker.Visit(node);

        SymbolClass symbolClass = typeChecker.symbolTable.RetrieveSymbol("Lars");
        assertNotNull(symbolClass);
    }
    @Test
    void visitArgumentWithBoolIsCorrectType() {
        Node node = new ArgumentNode(0, "bool");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);

        typeChecker.Visit(node);

        SymbolClass symbolClass = typeChecker.symbolTable.RetrieveSymbol("Lars");
        assertSame(boolean.class,symbolClass.Node.Type);
    }
    @Test
    void visitArgumentWithTextIsInSymbolTable() {
        Node node = new ArgumentNode(0, "text");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);

        typeChecker.Visit(node);

        SymbolClass symbolClass = typeChecker.symbolTable.RetrieveSymbol("Lars");
        assertNotNull(symbolClass);
    }
    @Test
    void visitArgumentWithTextIsCorrectType() {
        Node node = new ArgumentNode(0, "text");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);

        typeChecker.Visit(node);

        SymbolClass symbolClass = typeChecker.symbolTable.RetrieveSymbol("Lars");
        assertSame(String.class,symbolClass.Node.Type);
    }
    @Test
    void visitIntArrayExprWithIntIdentifier() {
        Node node = new ArrayExprNode(0);
        Node exprNode = new IntNode(0, 1);
        Node idNode = new IDNode(0,"idNode");
        node.AdoptChildren(idNode);
        node.AdoptChildren(exprNode);

        idNode.Type = int.class;
        typeChecker.symbolTable.EnterSymbol( "idNode",idNode);

        assertSame(int.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitDecimalArrayExprWithIntIdentifier() {
        Node node = new ArrayExprNode(0);
        Node exprNode = new IntNode(0, 1);
        Node idNode = new IDNode(0,"idNode");
        node.AdoptChildren(idNode);
        node.AdoptChildren(exprNode);

        idNode.Type = double.class;
        typeChecker.symbolTable.EnterSymbol( "idNode",idNode);

        assertSame(double.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitBoolArrayExprWithIntIdentifier() {
        Node node = new ArrayExprNode(0);
        Node exprNode = new IntNode(0, 1);
        Node idNode = new IDNode(0,"idNode");
        node.AdoptChildren(idNode);
        node.AdoptChildren(exprNode);

        idNode.Type = boolean.class;
        typeChecker.symbolTable.EnterSymbol( "idNode",idNode);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitTextArrayExprWithIntIdentifier() {
        Node node = new ArrayExprNode(0);
        Node exprNode = new IntNode(0, 1);
        Node idNode = new IDNode(0,"idNode");
        node.AdoptChildren(idNode);
        node.AdoptChildren(exprNode);

        idNode.Type = String.class;
        typeChecker.symbolTable.EnterSymbol( "idNode",idNode);

        assertSame(String.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitIntArrayExprWithDoubleIdentifier() {
        Node node = new ArrayExprNode(0);
        Node exprNode = new DecimalNode(0, 1.3);
        Node idNode = new IDNode(0,"idNode");
        node.AdoptChildren(idNode);
        node.AdoptChildren(exprNode);

        idNode.Type = int.class;
        typeChecker.symbolTable.EnterSymbol( "idNode",idNode);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitIntArrayExprWithBoolIdentifier() {
        Node node = new ArrayExprNode(0);
        Node exprNode = new BoolNode(0, true);
        Node idNode = new IDNode(0,"idNode");
        node.AdoptChildren(idNode);
        node.AdoptChildren(exprNode);

        idNode.Type = int.class;
        typeChecker.symbolTable.EnterSymbol( "idNode",idNode);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitIntArrayExprWithStringIdentifier() {
        Node node = new ArrayExprNode(0);
        Node exprNode = new StringNode(0, "testNode");
        Node idNode = new IDNode(0,"idNode");
        node.AdoptChildren(idNode);
        node.AdoptChildren(exprNode);

        idNode.Type = int.class;
        typeChecker.symbolTable.EnterSymbol( "idNode",idNode);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitIntArrayExprNotDeclared() {
        Node node = new ArrayExprNode(0);
        Node exprNode = new StringNode(0, "testNode");
        Node idNode = new IDNode(0,"idNode");

        node.AdoptChildren(idNode);
        node.AdoptChildren(exprNode);


        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
        //TODO: Gider ikke teste arrays mere

    @Test
    void visitAssignIntToInt() {
        Node node = new AssignNode(0);
        Node idNode = new IDNode(0, "variable");
        idNode.Type = int.class;
        Node refNode = new RefNode(0);
        Node value = new IntNode(0, 42);
        node.AdoptChildren(refNode);
        node.AdoptChildren(value);
        refNode.AdoptChildren(idNode);

        typeChecker.symbolTable.EnterSymbol("variable", idNode);

        assertSame(int.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitAssignDecimalToDecimal() {
        Node node = new AssignNode(0);
        Node idNode = new IDNode(0, "variable");
        idNode.Type = double.class;
        Node refNode = new RefNode(0);
        Node value = new DecimalNode(0, 34.3);
        node.AdoptChildren(refNode);
        node.AdoptChildren(value);
        refNode.AdoptChildren(idNode);

        typeChecker.symbolTable.EnterSymbol("variable", idNode);

        assertSame(double.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitAssignBoolToBool() {
        Node node = new AssignNode(0);
        Node idNode = new IDNode(0, "variable");
        idNode.Type = boolean.class;
        Node refNode = new RefNode(0);
        Node value = new BoolNode(0, true);
        node.AdoptChildren(refNode);
        node.AdoptChildren(value);
        refNode.AdoptChildren(idNode);

        typeChecker.symbolTable.EnterSymbol("variable", idNode);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitAssignStringToString() {
        Node node = new AssignNode(0);
        Node idNode = new IDNode(0, "variable");
        idNode.Type = String.class;
        Node refNode = new RefNode(0);
        Node value = new StringNode(9,"test");
        node.AdoptChildren(refNode);
        node.AdoptChildren(value);
        refNode.AdoptChildren(idNode);

        typeChecker.symbolTable.EnterSymbol("variable", idNode);

        assertSame(String.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitAssignIntToString() {
        Node node = new AssignNode(0);
        Node idNode = new IDNode(0, "variable");
        idNode.Type = String.class;
        Node refNode = new RefNode(0);
        Node value = new IntNode(0, 2);
        node.AdoptChildren(refNode, value);
        refNode.AdoptChildren(idNode);

        typeChecker.symbolTable.EnterSymbol("variable", idNode);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitAssignToUndeclaredVariable() {
        Node node = new AssignNode(0);
        Node idNode = new IDNode(0, "variable");
        idNode.Type = int.class;
        Node refNode = new RefNode(0);
        Node value = new IntNode(0, 2);
        node.AdoptChildren(refNode, value);
        refNode.AdoptChildren(idNode);
        typeChecker.Visit(node);

        //The error is found when visiting IDNode, therefore the errorFlag is set on that node, if it is not in the scope.
        assertTrue(idNode.ErrorFlag);
    }
    @Test
    void visitBehavior(){
        //TODO: test for undeclared behaviour and declared
    }
    @Test
    void visitDclNewIntVariable(){
        Node node = new DclNode(0,"int");
        Node idNode = new IDNode(0, "variableDCL");
        node.AdoptChildren(idNode);

        typeChecker.Visit(node);

        assertTrue(typeChecker.symbolTable.DeclaredLocally("variableDCL"));

    }
    @Test
    void visitDclNewTextVariable(){
        Node node = new DclNode(0,"text");
        Node idNode = new IDNode(0, "variableDCL");
        node.AdoptChildren(idNode);

        typeChecker.Visit(node);

        assertTrue(typeChecker.symbolTable.DeclaredLocally("variableDCL"));
    }
    @Test
    void visitDclNewBoolVariable(){
        Node node = new DclNode(0,"bool");
        Node idNode = new IDNode(0, "variableDCL");
        node.AdoptChildren(idNode);

        typeChecker.Visit(node);

        assertTrue(typeChecker.symbolTable.DeclaredLocally("variableDCL"));
    }

    @Test
    void visitDclNewDecimalVariable(){
        Node node = new DclNode(0,"decimal");
        Node idNode = new IDNode(0, "variableDCL");
        node.AdoptChildren(idNode);

        typeChecker.Visit(node);

        assertTrue(typeChecker.symbolTable.DeclaredLocally("variableDCL"));
    }
    @Test
    void visitDclDublicateNode(){
        Node node = new DclNode(0,"decimal");
        Node idNode = new IDNode(0, "variableDCL");
        node.AdoptChildren(idNode);

        Node someOtherNode = new IntNode(0,4);
        someOtherNode.Type = int.class;
        typeChecker.symbolTable.EnterSymbol("variableDCL", someOtherNode);

        typeChecker.Visit(node);

        assertTrue(node.ErrorFlag);
    }
    @Test
    void visitDivExprIntAndDecimal() {
        Node node = new DivExprNode(0);
        node.AdoptChildren(new IntNode(0,3), new DecimalNode(0,2.2));
        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }

    @Test
    void visitDivExprIntAndInt() {
        Node node = new DivExprNode(0);
        node.AdoptChildren(new IntNode(0,3), new IntNode(0,2));
        typeChecker.Visit(node);
        assertSame(int.class, node.Type);
    }
    @Test
    void visitDivExprIntAndIntWith0() {
        Node node = new DivExprNode(0);
        node.AdoptChildren(new IntNode(0,3), new IntNode(0,0));
        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }


    @Test
    void visitDivExprDecimalAndDecimal() {
        Node node = new DivExprNode(0);
        node.AdoptChildren(new DecimalNode(0,2.5), new DecimalNode(0,11.2));

        assertSame( double.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitDivExprStringAndString() {
        Node node = new DivExprNode(0);
        node.AdoptChildren(new StringNode(0,"One String"));
        node.AdoptChildren(new StringNode(0,"Two String"));

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitDivExprBoolAndBool() {
        Node node = new DivExprNode(0);
        node.AdoptChildren(new BoolNode(0,true));
        node.AdoptChildren(new BoolNode(0,true));

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }

}
