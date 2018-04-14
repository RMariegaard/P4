package com.company;
import Nodes.Node;
import antlr.antlrLexer;
import antlr.antlrParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import other.BuildASTVisitor;
import other.*;

import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
	// write your code here
        try {
            antlrParser.ProgContext cst = getCST("codeExample.txt");
            Node ast = new BuildASTVisitor().visitProg(cst);
            ast.makeNode();
            //ASTPrinter.PrintTree((ast));

            //SymbolTable table = new SymbolTable();
            //table.BuildTable(ast);
            //table.hashCode();

            TypeCheckerVisitor typeChecker = new TypeCheckerVisitor();
            Object errorFree = typeChecker.Visit(ast);
            //ASTPrinter.PrintTree((Node)errorFree);
            if (!typeChecker.ErrorList.isEmpty()) {
                System.out.println("TYPECHECkER ERROR MESSAGES:");
                for (String error : typeChecker.ErrorList) {
                    System.out.println(error);
                }
        }

        }catch (IOException e){
            System.out.println(e.getMessage() + " ERROR" );
        }
        System.out.println("DONE");

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
