package Tests;

import Nodes.AndNode;
import Nodes.ArgumentNode;
import Nodes.Node;
import Nodes.RefNode;
import Nodes.expr.AddExprNode;
import Nodes.values.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import other.TypeCheckerVisitor;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;


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
    }

    @Test
    void visitAddExprIntAndDecimal() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new IntNode(0,3));
        node.AdoptChildren(new DecimalNode(0,2.2));

        assertNull(typeChecker.Visit(node));
    }

    @Test
    void visitAddExprIntAndInt() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new IntNode(0,3));
        node.AdoptChildren(new IntNode(0,2));

        assertSame(typeChecker.Visit(node), int.class);
    }
    @Test
    void visitAddExprDecimalAndDecimal() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new DecimalNode(0,2.5));
        node.AdoptChildren(new DecimalNode(0,11.2));

        assertSame(typeChecker.Visit(node), double.class);
    }
    @Test
    void visitAddExprStringAndString() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new StringNode(0,"One String"));
        node.AdoptChildren(new StringNode(0,"Two String"));

        //Skal vi kunne gøre dette? så brug
        //assertSame(typeChecker.Visit(node), String.class);

        assertNull(typeChecker.Visit(node));
    }
    @Test
    void visitAddExprBoolAndBool() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new BoolNode(0,true));
        node.AdoptChildren(new BoolNode(0,true));

        assertNull(typeChecker.Visit(node));
    }


    @Test
    void visitAndWithBools() {
        Node node = new AndNode(0);
        node.AdoptChildren(new BoolNode(0,true));
        node.AdoptChildren(new BoolNode(0,true));

        assertSame( boolean.class, typeChecker.Visit(node));
    }

    @Test
    void visitAndWithError() {
        Node node = new AndNode(0);
        node.AdoptChildren(new IntNode(0,12));
        node.AdoptChildren(new BoolNode(0,true));
        typeChecker.Visit(node);
        assertTrue(!typeChecker.ErrorList.isEmpty());
    }

    @Test
    void visitArgumentDublicateInSymbolTable() {
        Node node = new ArgumentNode(0, "int");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);

        typeChecker.symbolTable.EnterSymbol("Lars", int.class);

        assertNull(typeChecker.Visit(node));
    }

    @Test
    void visitArgumentWithInt() {
        Node node = new ArgumentNode(0, "int");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);

        assertSame(int.class, typeChecker.Visit(node));
    }
    @Test
    void visitArgumentWithDecimal() {
        Node node = new ArgumentNode(0, "decimal");
        Node refNode = new RefNode(0);
        refNode.AdoptChildren(new IDNode(0, "Lars"));
        node.AdoptChildren(refNode);

        assertSame(int.class, typeChecker.Visit(node));
    }

    @Test
    void visitArrayExpr() {
    }

    @Test
    void visitAssign() {
    }

}