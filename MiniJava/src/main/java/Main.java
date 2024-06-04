import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import parser.Parser;
import parser.ParserFacade;

public class Main {
    public static void main(String[] args) {
        String cwd = System.getProperty("user.dir");
        System.out.println(cwd);
        ParserFacade parser = new ParserFacade();
        try {
            // start parsing
            parser.startParse(new Scanner(new File("MiniJava/src/main/resources/code")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
