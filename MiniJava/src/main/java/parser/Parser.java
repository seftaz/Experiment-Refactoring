package parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Stack;

import Log.Log;
import codeGenerator.CodeGenerator;
import codeGenerator.CodeGeneratorFacade;
import errorHandler.ErrorHandler;
import scanner.lexicalAnalyzer;
import scanner.token.Token;

public class Parser {
    private ArrayList<Rule> rules;
    private Stack<Integer> parsStack;
    private ParseTable parseTable;
    private lexicalAnalyzer lexicalAnalyzer;
    private CodeGeneratorFacade cg;

    public Parser() {
        parsStack = new Stack<Integer>();
        parsStack.push(0);
        try {
            parseTable = new ParseTable(Files.readAllLines(Paths.get("MiniJava/src/main/resources/parseTable")).get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
        rules = new ArrayList<Rule>();
        loadRules();
        cg = new CodeGeneratorFacade();
    }

    private void loadRules() {
        try {
            for (String stringRule : Files.readAllLines(Paths.get("MiniJava/src/main/resources/Rules"))) {
                rules.add(new Rule(stringRule));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startParse(java.util.Scanner sc) {
        lexicalAnalyzer = new lexicalAnalyzer(sc);
        Token lookAhead = lexicalAnalyzer.getNextToken();
        boolean finish = false;
        Action currentAction;
        Log logger = Log.getInstance();
        while (!finish) {
            try {
                logger.print(/*"lookahead : "+*/ lookAhead.toString() + "\t" + parsStack.peek());
                currentAction = parseTable.getActionTable(parsStack.peek(), lookAhead);
                logger.print(currentAction.toString());

                switch (currentAction.action) {
                    case shift:
                        parsStack.push(currentAction.number);
                        lookAhead = lexicalAnalyzer.getNextToken();

                        break;
                    case reduce:
                        Rule rule = rules.get(currentAction.number);
                        reduce(lookAhead, logger, rule);
                        break;
                    case accept:
                        finish = true;
                        break;
                }
                logger.print("");
            } catch (Exception ignored) {
                ignored.printStackTrace();
            }
        }
        if (!ErrorHandler.hasError) cg.printMemory();
    }

    private void reduce(Token lookAhead, Log logger, Rule rule) {
        for (int i = 0; i < rule.RHS.size(); i++) {
            parsStack.pop();
        }

        logger.print(/*"state : " +*/ parsStack.peek() + "\t" + rule.LHS);
        parsStack.push(parseTable.getGotoTable(parsStack.peek(), rule.LHS));
        logger.print(/*"new State : " + */parsStack.peek() + "");
        try {
            cg.semanticFunction(rule.semanticAction, lookAhead);
        } catch (Exception e) {
            logger.print("Code Genetator Error");
        }
    }
}
