package com.company;
import Nodes.Node;
import antlr.antlrLexer;
import antlr.antlrParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import other.APIevents;
import other.BuildASTVisitor;
import other.ErrorListner;
import other.TypeCheckerVisitor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
	// write your code here
        try {
            antlrParser.ProgContext cst = getCST("CodeTemplet");
            if(cst != null  ){
                Node ast = new BuildASTVisitor().visitProg(cst);
                ast.makeNode();
                //ASTPrinter.PrintTree((ast));

                //SymbolTable table = new SymbolTable();
                //table.BuildTable(ast);
                //table.hashCode();
                ArrayList<APIevents> listOfAPIEvents = createListOfAPIEvents("RobotEvent_API.txt", "AdvancedRobotEvent_API.txt");

                TypeCheckerVisitor typeChecker = new TypeCheckerVisitor(listOfAPIEvents);
                typeChecker.AddLibraryFunctionsToSymbolTable("Robot_API.txt", "AdvancedRobot_API.txt");
                Object errorFree = typeChecker.Visit(ast);
                //ASTPrinter.PrintTree((Node)errorFree);
                if (!typeChecker.ErrorList.isEmpty()) {
                    System.out.println("TYPECHECkER ERROR MESSAGES:");
                    for (String error : typeChecker.ErrorList) {
                        System.out.println(error);
                    }
                }
            }
            else{
                System.out.println("Something happend");
            }

            //TODO: create a new file.


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

        parser.addErrorListener(new ErrorListner()); //TODO Use this for something. Should print out to the user
        antlrParser.ProgContext cst = parser.prog();
        if(parser.getNumberOfSyntaxErrors() ==0){
            return cst;
        }
        else {
            return null;
        }
    }

    public static ArrayList<APIevents> createListOfAPIEvents(String... files) throws IOException{
        ArrayList<APIevents> list = new ArrayList<>();
        for(String input : files){
            List<String> content = Files.readAllLines(Paths.get(input));
            String[] elements;
            for(String line : content){
                elements = line.split("\\s+"); //RobocodeName - returnType (most likely void) - OurName
                APIevents event = new APIevents();
                event.name = elements[0];
                event.param = elements[1];
                event.EventArg = elements[2];
                list.add(event);
            }
        }
        return list;
    }
}

