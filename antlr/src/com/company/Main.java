package com.company;
import antlr.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.nio.file.*;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            CharStream input = CharStreams.fromFileName("codeExample.txt");
            antlrLexer lexer = new antlrLexer(input);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            antlrParser parser = new antlrParser(tokenStream);

            parser.prog();


        }catch (IOException e){
            System.out.println(e.getMessage() + " ERROR" );
        }
        System.out.println("No Errors");
    }
}
