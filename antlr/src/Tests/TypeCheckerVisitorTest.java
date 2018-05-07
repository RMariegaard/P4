/*
package Tests;

import Nodes.*;
import Nodes.expr.*;
import Nodes.values.*;
import Types.EventType;
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
    @Test
    void visitDoStmtNoErrors(){
        Node node = new DoStmtNode(0);
        Node argument = new ArgumentNode(0,"int");
        Node ref = new RefNode(0);
        Node idNode = new IDNode(0, "i");

        ref.AdoptChildren(idNode);
        argument.AdoptChildren(ref);

        Node start = new IntNode(0, 0);
        Node end = new IntNode(0, 5);

        Node increment = new UAddNode(0);
        Node refInc = new RefNode(0);
        Node idInc = new IDNode(0, "i");
        increment.AdoptChildren(refInc.AdoptChildren(idInc));

        Node block = new BlockNode(0);
        node.AdoptChildren(argument, start, end, increment, block);

        typeChecker.Visit(node);
        assertFalse(node.ErrorFlag);
    }
    @Test
    void visitDoStmtVariableError(){
        Node node = new DoStmtNode(0);
        //variable node
        Node argument = new ArgumentNode(0,"decimal");
        Node ref = new RefNode(0);
        Node idNode = new IDNode(0, "i");
        ref.AdoptChildren(idNode);
        argument.AdoptChildren(ref);
        //Startvalue and endvalue
        Node start = new IntNode(0, 0);
        Node end = new IntNode(0, 5);
        //Increment node
        Node increment = new UAddNode(0);
        Node refInc = new RefNode(0);
        Node idInc = new IDNode(0, "i");
        increment.AdoptChildren(refInc.AdoptChildren(idInc));

        //Block
        Node block = new BlockNode(0);
        node.AdoptChildren(argument, start, end, increment, block);

        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }

    @Test
    void visitDoStmtStartError(){
        Node node = new DoStmtNode(0);
        Node argument = new ArgumentNode(0,"int");
        Node ref = new RefNode(0);
        Node idNode = new IDNode(0, "i");

        ref.AdoptChildren(idNode);
        argument.AdoptChildren(ref);

        Node start = new DecimalNode(0, 0.444);
        Node end = new IntNode(0, 5);

        Node increment = new UAddNode(0);
        Node refInc = new RefNode(0);
        Node idInc = new IDNode(0, "i");
        increment.AdoptChildren(refInc.AdoptChildren(idInc));


        Node block = new BlockNode(0);
        node.AdoptChildren(argument, start, end, increment, block);

        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }
    @Test
    void visitDoStmtEndError(){
        Node node = new DoStmtNode(0);
        //variable node
        Node argument = new ArgumentNode(0,"int");
        Node ref = new RefNode(0);
        Node idNode = new IDNode(0, "i");
        ref.AdoptChildren(idNode);
        argument.AdoptChildren(ref);
        //Startvalue and endvalue
        Node start = new IntNode(0, 0);
        Node end = new DecimalNode(0, 5.09);
        //Increment node
        Node increment = new UAddNode(0);
        Node refInc = new RefNode(0);
        Node idInc = new IDNode(0, "i");
        increment.AdoptChildren(refInc.AdoptChildren(idInc));

        //Block
        Node block = new BlockNode(0);
        node.AdoptChildren(argument, start, end, increment, block);

        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }
    @Test
    void visitDoStmtIncrementErrorWrongName(){
        Node node = new DoStmtNode(0);
        //variable node
        Node argument = new ArgumentNode(0,"int");
        Node ref = new RefNode(0);
        Node idNode = new IDNode(0, "i");
        ref.AdoptChildren(idNode);
        argument.AdoptChildren(ref);
        //Startvalue and endvalue
        Node start = new IntNode(0, 0);
        Node end = new DecimalNode(0, 5.09);
        //Increment node
        Node increment = new UAddNode(0);
        Node refInc = new RefNode(0);
        Node idInc = new IDNode(0, "p");
        increment.AdoptChildren(refInc.AdoptChildren(idInc));

        //Block
        Node block = new BlockNode(0);
        node.AdoptChildren(argument, start, end, increment, block);

        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }
    //TODO: test do noget mere

    @Test
    void visitElseIfWithBoolCondition(){
        Node node = new ElseIfNode(0);
        Node boolNode = new BoolNode(0, true);
        Node block = new BlockNode(0);

        node.AdoptChildren(boolNode,block);

        assertFalse(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitElseIfWithNotBoolCondition(){
        Node node = new ElseIfNode(0);
        Node boolNode = new IntNode(0, 4);
        Node block = new BlockNode(0);

        node.AdoptChildren(boolNode,block);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }

    @Test
    void visitEqualNodeTypeIntAndInt(){
        Node node = new EqualNode(0);
        Node intNode = new IntNode(0, 2);
        Node intNode2 = new IntNode(0, 2);

        node.AdoptChildren(intNode, intNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitEqualNodeTypeDecimalAndDecimal(){
        Node node = new EqualNode(0);
        Node decimalNode = new DecimalNode(0, 2.2);
        Node decimalNode2 = new DecimalNode(0, 2.2);

        node.AdoptChildren(decimalNode, decimalNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitEqualNodeTypeBoolAndBool(){
        Node node = new EqualNode(0);
        Node boolNode = new BoolNode(0, true);
        Node boolNode2 = new BoolNode(0, true);

        node.AdoptChildren(boolNode, boolNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitEqualNodeTypeTextAndText(){

        Node node = new EqualNode(0);
        Node StringNode = new StringNode(0, "string");
        Node StringNode2 = new StringNode(0, "string");

        node.AdoptChildren(StringNode, StringNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitEqualNodeTypeBoolAndInt(){
        Node node = new EqualNode(0);
        Node boolNode = new BoolNode(0, true);
        Node intNode = new IntNode(0, 3);

        node.AdoptChildren(boolNode, intNode);

        assertTrue( typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitEventNodeNameAlreadyExist(){
        Node randomNode = new IDNode(1,"eventDcl");
        randomNode.Type = int.class;
        typeChecker.symbolTable.EnterSymbol("eventDcl", randomNode);

        Node node = new EventNode(1);
        Node idNode = new IDNode(1,"eventDcl");
        Node condition = new BoolNode(1, true);

        node.AdoptChildren(idNode,condition);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitEventNodeConditionNotBool(){
        Node node = new EventNode(1);
        Node idNode = new IDNode(1,"eventDcl");
        Node condition = new IntNode(1, 3);

        node.AdoptChildren(idNode,condition);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }

    @Test
    void visitEventNodeCorrect(){
        Node node = new EventNode(1);
        Node idNode = new IDNode(1,"eventDcl");
        Node condition = new BoolNode(1, true);

        node.AdoptChildren(idNode,condition);

        assertSame(EventType.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitFcallNodeNoParamsNoError(){
        //Setup, creating a method and adds it to symbol table
        Node methodNode = new MethodNode(1);
        Node nameNode = new IDNode(1, "functionTest");
        nameNode.Type = int.class;
        Node type = new RTypeNode(0, "int");
        methodNode.Type = int.class;
        methodNode.AdoptChildren(nameNode, type);
        typeChecker.symbolTable.EnterSymbol("functionTest", methodNode);

        //Test
        Node node = new FcallNode(1);
        Node idNode = new IDNode(1, "functionTest");
        node.AdoptChildren(idNode);

        typeChecker.Visit(node);
        assertFalse(node.ErrorFlag);
    }
    @Test
    void visitFcallNodeOneParamsNoError(){
        //Setup, creating a method and adds it to symbol table
        Node methodNode = new MethodNode(1);
        Node nameNode = new IDNode(1, "functionTest");
        nameNode.Type = int.class;
        Node type = new RTypeNode(0, "int");
        methodNode.Type = int.class;
        Node argument = new ArgumentNode(1, "int");
        methodNode.AdoptChildren(nameNode, type, argument);
        typeChecker.symbolTable.EnterSymbol("functionTest", methodNode);

        //Test
        Node node = new FcallNode(1);
        Node idNode = new IDNode(1, "functionTest");
        Node intNode2 = new IntNode(1, 2);
        node.AdoptChildren(idNode, intNode2);

        typeChecker.Visit(node);
        assertFalse(node.ErrorFlag);
    }

    @Test
    void visitFcallNodeToManyArguments(){
        //Setup, creating a method and adds it to symbol table
        Node methodNode = new MethodNode(1);
        Node nameNode = new IDNode(1, "functionTest");
        nameNode.Type = int.class;
        Node type = new RTypeNode(0, "int");
        methodNode.Type = int.class;
        methodNode.AdoptChildren(nameNode, type);
        typeChecker.symbolTable.EnterSymbol("functionTest", methodNode);

        //Test
        Node node = new FcallNode(1);
        Node idNode = new IDNode(1, "functionTest");
        Node intNode = new IntNode(1, 2);
        node.AdoptChildren(idNode, intNode);

        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }
    @Test
    void visitFcallNodeToManyParameters(){
        //Setup, creating a method and adds it to symbol table
        Node methodNode = new MethodNode(1);
        Node nameNode = new IDNode(1, "functionTest");
        nameNode.Type = int.class;
        Node type = new RTypeNode(0, "int");
        methodNode.Type = int.class;
        Node argument = new ArgumentNode(1, "int");
        methodNode.AdoptChildren(nameNode, type, argument);
        typeChecker.symbolTable.EnterSymbol("functionTest", methodNode);

        //Test
        Node node = new FcallNode(1);
        Node idNode = new IDNode(1, "functionTest");
        node.AdoptChildren(idNode);

        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }
    @Test
    void visitFcallNodeArgumentWrongType(){
        //Setup, creating a method and adds it to symbol table
        Node methodNode = new MethodNode(1);
        Node nameNode = new IDNode(1, "functionTest");
        nameNode.Type = int.class;
        Node type = new RTypeNode(0, "int");
        methodNode.Type = int.class;
        Node argument = new ArgumentNode(1, "int");
        methodNode.AdoptChildren(nameNode, type, argument);
        typeChecker.symbolTable.EnterSymbol("functionTest", methodNode);

        //Test
        Node node = new FcallNode(1);
        Node idNode = new IDNode(1, "functionTest");
        Node intNode2 = new DecimalNode(1, 2.2);
        node.AdoptChildren(idNode, intNode2);

        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }

    @Test
    void visitGreaterNodeTypeIntAndInt(){
        Node node = new GreaterNode(0);
        Node intNode = new IntNode(0, 2);
        Node intNode2 = new IntNode(0, 2);

        node.AdoptChildren(intNode, intNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitGreaterNodeTypeDecimalAndDecimal(){
        Node node = new GreaterNode(0);
        Node decimalNode = new DecimalNode(0, 2.2);
        Node decimalNode2 = new DecimalNode(0, 2.2);

        node.AdoptChildren(decimalNode, decimalNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitGreaterNodeTypeBoolAndBool(){
        Node node = new GreaterNode(0);
        Node boolNode = new BoolNode(0, true);
        Node boolNode2 = new BoolNode(0, true);

        node.AdoptChildren(boolNode, boolNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitGreaterNodeTypeTextAndText(){

        Node node = new GreaterNode(0);
        Node StringNode = new StringNode(0, "string");
        Node StringNode2 = new StringNode(0, "string");

        node.AdoptChildren(StringNode, StringNode2);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitGreaterNodeTypeBoolAndInt(){
        Node node = new GreaterNode(0);
        Node boolNode = new BoolNode(0, true);
        Node intNode = new IntNode(0, 3);

        node.AdoptChildren(boolNode, intNode);

        assertTrue( typeChecker.Visit(node).ErrorFlag);
    }

    @Test
    void visitGreaterEqualNodeTypeIntAndInt(){
        Node node = new GreaterEqualNode(0);
        Node intNode = new IntNode(0, 2);
        Node intNode2 = new IntNode(0, 2);

        node.AdoptChildren(intNode, intNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitGreaterEqualNodeTypeDecimalAndDecimal(){
        Node node = new GreaterEqualNode(0);
        Node decimalNode = new DecimalNode(0, 2.2);
        Node decimalNode2 = new DecimalNode(0, 2.2);

        node.AdoptChildren(decimalNode, decimalNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitGreaterEqualNodeTypeBoolAndBool(){
        Node node = new GreaterEqualNode(0);
        Node boolNode = new BoolNode(0, true);
        Node boolNode2 = new BoolNode(0, true);

        node.AdoptChildren(boolNode, boolNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitGreaterEqualNodeTypeTextAndText(){

        Node node = new GreaterEqualNode(0);
        Node StringNode = new StringNode(0, "string");
        Node StringNode2 = new StringNode(0, "string");

        node.AdoptChildren(StringNode, StringNode2);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitGreaterEqualNodeTypeBoolAndInt(){
        Node node = new GreaterEqualNode(0);
        Node boolNode = new BoolNode(0, true);
        Node intNode = new IntNode(0, 3);

        node.AdoptChildren(boolNode, intNode);

        assertTrue( typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitIDNode(){
        Node node = new IDNode(0, "IDTest");
        node.Type = int.class;
        typeChecker.symbolTable.EnterSymbol("IDTest", node);

        Node newNode = new IDNode(0, "IDTest");
        typeChecker.Visit(newNode);
        assertSame(node.Type, newNode.Type);

    }
    @Test
    void visitIDNodeNotDcl(){
        Node newNode = new IDNode(0, "IDTest");
        typeChecker.Visit(newNode);
        assertTrue( newNode.ErrorFlag);
    }
    @Test
    void visitIfWithBoolCondition(){
        Node node = new IfStmtNode(0);
        Node boolNode = new BoolNode(0, true);
        Node block = new BlockNode(0);

        node.AdoptChildren(boolNode,block);

        assertFalse(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitIfWithNotBoolCondition(){
        Node node = new IfStmtNode(0);
        Node boolNode = new IntNode(0, 4);
        Node block = new BlockNode(0);

        node.AdoptChildren(boolNode,block);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }

    @Test
    void visitLessEqualNodeTypeIntAndInt(){
        Node node = new LessEqualNode(0);
        Node intNode = new IntNode(0, 2);
        Node intNode2 = new IntNode(0, 2);

        node.AdoptChildren(intNode, intNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitLessEqualNodeTypeDecimalAndDecimal(){
        Node node = new LessEqualNode(0);
        Node decimalNode = new DecimalNode(0, 2.2);
        Node decimalNode2 = new DecimalNode(0, 2.2);

        node.AdoptChildren(decimalNode, decimalNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitLessEqualNodeTypeBoolAndBool(){
        Node node = new LessEqualNode(0);
        Node boolNode = new BoolNode(0, true);
        Node boolNode2 = new BoolNode(0, true);

        node.AdoptChildren(boolNode, boolNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitLessEqualNodeTypeTextAndText(){

        Node node = new LessEqualNode(0);
        Node StringNode = new StringNode(0, "string");
        Node StringNode2 = new StringNode(0, "string");

        node.AdoptChildren(StringNode, StringNode2);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitLessEqualNodeTypeBoolAndInt(){
        Node node = new LessEqualNode(0);
        Node boolNode = new BoolNode(0, true);
        Node intNode = new IntNode(0, 3);

        node.AdoptChildren(boolNode, intNode);

        assertTrue( typeChecker.Visit(node).ErrorFlag);
    }


    @Test
    void visitLessNodeTypeIntAndInt(){
        Node node = new LessNode(0);
        Node intNode = new IntNode(0, 2);
        Node intNode2 = new IntNode(0, 2);

        node.AdoptChildren(intNode, intNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitLessNodeTypeDecimalAndDecimal(){
        Node node = new LessNode(0);
        Node decimalNode = new DecimalNode(0, 2.2);
        Node decimalNode2 = new DecimalNode(0, 2.2);

        node.AdoptChildren(decimalNode, decimalNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitLessNodeTypeBoolAndBool(){
        Node node = new LessNode(0);
        Node boolNode = new BoolNode(0, true);
        Node boolNode2 = new BoolNode(0, true);

        node.AdoptChildren(boolNode, boolNode2);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitLessNodeTypeTextAndText(){

        Node node = new LessNode(0);
        Node StringNode = new StringNode(0, "string");
        Node StringNode2 = new StringNode(0, "string");

        node.AdoptChildren(StringNode, StringNode2);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitLessNodeTypeBoolAndInt(){
        Node node = new LessNode(0);
        Node boolNode = new BoolNode(0, true);
        Node intNode = new IntNode(0, 3);

        node.AdoptChildren(boolNode, intNode);

        assertTrue( typeChecker.Visit(node).ErrorFlag);
    }

    @Test
    void visitMethodNode(){
        Node methodNode = new MethodNode(1);
        Node nameNode = new IDNode(1, "MethodTest");
        nameNode.Type = int.class;
        Node type = new RTypeNode(0, "int");
        methodNode.Type = int.class;
        Node argument = new ArgumentNode(1, "int");
        methodNode.AdoptChildren(nameNode, type, argument);
        typeChecker.Visit(methodNode);
        assertTrue(typeChecker.symbolTable.DeclaredLocally("MethodTest"));

    }
    @Test
    void visitMethodNodeAlreadyDeclared(){
        Node idNode = new IDNode(3, "MethodTest");
        typeChecker.symbolTable.EnterSymbol("MethodTest", idNode);

        Node methodNode = new MethodNode(1);
        Node nameNode = new IDNode(1, "MethodTest");
        nameNode.Type = int.class;
        Node type = new RTypeNode(0, "int");
        methodNode.Type = int.class;
        Node argument = new ArgumentNode(1, "int");
        methodNode.AdoptChildren(nameNode, type, argument);
        typeChecker.Visit(methodNode);
        assertTrue(methodNode.ErrorFlag);

    }


    @Test
    void visitMulExprIntAndDecimal() {
        Node node = new MulExprNode(0);
        node.AdoptChildren(new IntNode(0,3), new DecimalNode(0,2.2));
        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }

    @Test
    void visitMulExprIntAndInt() {
        Node node = new MulExprNode(0);
        node.AdoptChildren(new IntNode(0,3), new IntNode(0,2));
        typeChecker.Visit(node);
        assertSame(int.class, node.Type);
    }

    @Test
    void visitMulExprDecimalAndDecimal() {
        Node node = new MulExprNode(0);
        node.AdoptChildren(new DecimalNode(0,2.5), new DecimalNode(0,11.2));

        assertSame( double.class, typeChecker.Visit(node).Type);
    }

    @Test
    void visitMulExprStringAndString() {
        Node node = new MulExprNode(0);
        node.AdoptChildren(new StringNode(0,"One String"));
        node.AdoptChildren(new StringNode(0,"Two String"));

        //Skal vi kunne gøre dette? så brug
        //assertSame(typeChecker.Visit(node), String.class);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitMulExprBoolAndBool() {
        Node node = new MulExprNode(0);
        node.AdoptChildren(new BoolNode(0,true));
        node.AdoptChildren(new BoolNode(0,true));

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitNotExprBool(){
        Node node = new NotExprNode(0);
        Node boolNode = new BoolNode(0, true);
        node.AdoptChildren(boolNode);

        assertSame(boolean.class, typeChecker.Visit(node).Type);
    }
    @Test
    void visitNotExprInt(){
        Node node = new NotExprNode(0);
        Node boolNode = new IntNode(0, 12);
        node.AdoptChildren(boolNode);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitOrWithBools() {
        Node node = new OrNode(0);
        node.AdoptChildren(new BoolNode(0,true));
        node.AdoptChildren(new BoolNode(0,true));

        assertSame( boolean.class, typeChecker.Visit(node).Type);
    }

    @Test
    void visitOrWithError() {
        Node node = new OrNode(0);
        node.AdoptChildren(new IntNode(0,12));
        node.AdoptChildren(new BoolNode(0,true));
        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }
    @Test
    void visitSubExprIntAndDecimal() {
        Node node = new SubExprNode(0);
        node.AdoptChildren(new IntNode(0,3), new DecimalNode(0,2.2));
        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }

    @Test
    void visitSubExprIntAndInt() {
        Node node = new SubExprNode(0);
        node.AdoptChildren(new IntNode(0,3), new IntNode(0,2));
        typeChecker.Visit(node);
        assertSame(int.class, node.Type);
    }

    @Test
    void visitSubExprDecimalAndDecimal() {
        Node node = new SubExprNode(0);
        node.AdoptChildren(new DecimalNode(0,2.5), new DecimalNode(0,11.2));

        assertSame( double.class, typeChecker.Visit(node).Type);
    }

    @Test
    void visitSubExprStringAndString() {
        Node node = new SubExprNode(0);
        node.AdoptChildren(new StringNode(0,"One String"));
        node.AdoptChildren(new StringNode(0,"Two String"));

        //Skal vi kunne gøre dette? så brug
        //assertSame(typeChecker.Visit(node), String.class);

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitSubExprBoolAndBool() {
        Node node = new SubExprNode(0);
        node.AdoptChildren(new BoolNode(0,true));
        node.AdoptChildren(new BoolNode(0,true));

        assertTrue(typeChecker.Visit(node).ErrorFlag);
    }
    @Test
    void visitUSubNode(){
        Node node = new UsubNode(0);
        Node refNode = new RefNode(0);
        Node idNode = new IDNode(0, "variable");
        idNode.Type = int.class;
        refNode.AdoptChildren(idNode);
        node.AdoptChildren(refNode);

        typeChecker.Visit(node);
        assertFalse(node.ErrorFlag);
    }
    @Test
    void visitUSubNodeNotInt(){
        Node node = new UsubNode(0);
        Node refNode = new RefNode(0);
        Node idNode = new IDNode(0, "variable");
        idNode.Type = double.class;
        refNode.AdoptChildren(idNode);
        node.AdoptChildren(refNode);

        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }
    @Test
    void visitUAddNode(){
        Node node = new UAddNode(0);
        Node refNode = new RefNode(0);
        Node idNode = new IDNode(0, "variable");
        idNode.Type = int.class;
        refNode.AdoptChildren(idNode);
        node.AdoptChildren(refNode);

        typeChecker.Visit(node);
        assertFalse(node.ErrorFlag);
    }
    @Test
    void visitUAddNodeNotInt(){
        Node node = new UAddNode(0);
        Node refNode = new RefNode(0);
        Node idNode = new IDNode(0, "variable");
        idNode.Type = double.class;
        refNode.AdoptChildren(idNode);
        node.AdoptChildren(refNode);

        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }

    @Test
    void visitWhileStmt(){
        Node node = new WhileStmtNode(0);
        Node condition = new BoolNode(0, true);
        Node block = new BlockNode(0);
        node.AdoptChildren(condition, block);

        typeChecker.Visit(node);
        assertFalse(node.ErrorFlag);

    }
    @Test
    void visitWhileStmtConditionNotBool(){
        Node node = new WhileStmtNode(0);
        Node condition = new IntNode(0, 22);
        Node block = new BlockNode(0);
        node.AdoptChildren(condition, block);

        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);

    }
}
*/