package Tests;

import Nodes.Node;
import Nodes.expr.AddExprNode;
import Nodes.values.DecimalNode;
import Nodes.values.IntNode;
import other.SymbolTable;
import other.TypeCheckerVisitor;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

class TypeCheckerVisitorTest {
    SymbolTable symbolTable;
    TypeCheckerVisitor typeChecker;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         symbolTable = new SymbolTable();
         typeChecker = new TypeCheckerVisitor();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void visitAction() {
    }

    @org.junit.jupiter.api.Test
    void visitAddExprIntAndDouble() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new IntNode(0,3));
        node.AdoptChildren(new DecimalNode(0,2.2));

        assertNull(typeChecker.Visit(node));
    }

    @org.junit.jupiter.api.Test
    void visitAddExprIntAndInt() {
        Node node = new AddExprNode(0);
        node.AdoptChildren(new IntNode(0,3));
        node.AdoptChildren(new IntNode(0,2));

        assertSame(typeChecker.Visit(node), int.class);
    }

    @org.junit.jupiter.api.Test
    void visitAnd() {
    }

    @org.junit.jupiter.api.Test
    void visitArgument() {
    }

    @org.junit.jupiter.api.Test
    void visitArrayExpr() {
    }

    @org.junit.jupiter.api.Test
    void visitAssign() {
    }

    @org.junit.jupiter.api.Test
    void visit6() {
    }

    @org.junit.jupiter.api.Test
    void visit7() {
    }

    @org.junit.jupiter.api.Test
    void visit8() {
    }

    @org.junit.jupiter.api.Test
    void visit9() {
    }

    @org.junit.jupiter.api.Test
    void visit10() {
    }

    @org.junit.jupiter.api.Test
    void visit11() {
    }

    @org.junit.jupiter.api.Test
    void visit12() {
    }

    @org.junit.jupiter.api.Test
    void visit13() {
    }

    @org.junit.jupiter.api.Test
    void visit14() {
    }

    @org.junit.jupiter.api.Test
    void visit15() {
    }

    @org.junit.jupiter.api.Test
    void visit16() {
    }

    @org.junit.jupiter.api.Test
    void visit17() {
    }

    @org.junit.jupiter.api.Test
    void visit18() {
    }

    @org.junit.jupiter.api.Test
    void visit19() {
    }

    @org.junit.jupiter.api.Test
    void visit20() {
    }

    @org.junit.jupiter.api.Test
    void visit21() {
    }

    @org.junit.jupiter.api.Test
    void visit22() {
    }

    @org.junit.jupiter.api.Test
    void visit23() {
    }

    @org.junit.jupiter.api.Test
    void visit24() {
    }

    @org.junit.jupiter.api.Test
    void visit25() {
    }

    @org.junit.jupiter.api.Test
    void visit26() {
    }

    @org.junit.jupiter.api.Test
    void visit27() {
    }

    @org.junit.jupiter.api.Test
    void visit28() {
    }

    @org.junit.jupiter.api.Test
    void visit29() {
    }

    @org.junit.jupiter.api.Test
    void visit30() {
    }

    @org.junit.jupiter.api.Test
    void visit31() {
    }

    @org.junit.jupiter.api.Test
    void visit32() {
    }

    @org.junit.jupiter.api.Test
    void visit33() {
    }

    @org.junit.jupiter.api.Test
    void visit34() {
    }

    @org.junit.jupiter.api.Test
    void visit35() {
    }

    @org.junit.jupiter.api.Test
    void visit36() {
    }

    @org.junit.jupiter.api.Test
    void visit37() {
    }

    @org.junit.jupiter.api.Test
    void visit38() {
    }

    @org.junit.jupiter.api.Test
    void visit39() {
    }

    @org.junit.jupiter.api.Test
    void visit40() {
    }

    @org.junit.jupiter.api.Test
    void visit41() {
    }
}