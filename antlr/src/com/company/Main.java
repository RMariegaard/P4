package com.company;
import Nodes.Node;
import antlr.antlrLexer;
import antlr.antlrParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            CharStream input = CharStreams.fromFileName("example2.txt");
            antlrLexer lexer = new antlrLexer(input);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            antlrParser parser = new antlrParser(tokenStream);

            antlrParser.ProgContext cst = parser.prog();
            Node ast = new com.company.BuildASTVisitor().visitProg(cst);
            ast.makeNode();
            ast.hashCode();
            ASTPrinter.PrintTree((ast));

        }catch (IOException e){
            System.out.println(e.getMessage() + " ERROR" );
        }
        System.out.println("No Errors");
    }
}
