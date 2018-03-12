package com.company;
import gen.antlr.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            antlrLexer lexer = new antlrLexer(CharStreams.fromFileName("codeExample.txt"));
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            antlrParser parser = new antlrParser(tokenStream);
        }catch (IOException e){

        }
        System.out.println("cool");
    }
}
