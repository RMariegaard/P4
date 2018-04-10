package com.company;
import Nodes.Node;
import antlr.antlrLexer;
import antlr.antlrParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            antlrParser.ProgContext cst = getCST("codeExample.txt");
            Node ast = new com.company.BuildASTVisitor().visitProg(cst);
            ast.makeNode();
            ast.hashCode();

            SymbolTable table = new SymbolTable();
            table.BuildTable(ast);
            ASTPrinter.PrintTree((ast));
            table.hashCode();
        }catch (IOException e){
            System.out.println(e.getMessage() + " ERROR" );
        }
        System.out.println("No Errors");
    }

    public static antlrParser.ProgContext getCST(String fileName) throws FileNotFoundException, IOException{
        CharStream input = CharStreams.fromFileName(fileName);
        antlrLexer lexer = new antlrLexer(input);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        antlrParser parser = new antlrParser(tokenStream);

        antlrParser.ProgContext cst = parser.prog();

        return cst;
    }
}
