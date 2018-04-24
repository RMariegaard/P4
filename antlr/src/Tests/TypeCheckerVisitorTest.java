package Tests;

import Nodes.*;
import Nodes.expr.AddExprNode;
import Nodes.expr.ArrayExprNode;
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
        node.AdoptChildren(new IntNode(0,3));
        node.AdoptChildren(new DecimalNode(0,2.2));
        typeChecker.Visit(node);
        assertTrue(node.ErrorFlag);
    }

    @Test
    void visitAddExprIntAndInt() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new IntNode(0,3));
        node.AdoptChildren(new IntNode(0,2));
        typeChecker.Visit(node);
        assertSame(int.class, node.Type);
    }
    @Test
    void visitAddExprDecimalAndDecimal() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new DecimalNode(0,2.5));
        node.AdoptChildren(new DecimalNode(0,11.2));

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

        typeChecker.symbolTable.EnterSymbol("Lars", int.class);
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
        assertSame(int.class,symbolClass.type);
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
        assertSame(double.class,symbolClass.type);
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
        assertSame(boolean.class,symbolClass.type);
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
        assertSame(String.class,symbolClass.type);
    }
    @Test
    void visitIntArrayExprWithIntIdentifier() {
        Node node = new ArrayExprNode(0);
        Node idNode = new IDNode(0,"idNode");
        idNode.Type = int.class;
        //TODO: vent på Casper laver Symbol table

        Node intNode = new IntNode(0, 1);

    }

    @Test
    void visitAssign() {
        Node node = AssignNode(0,);

    }

}