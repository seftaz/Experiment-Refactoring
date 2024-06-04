package parser;

import java.util.Scanner;

public class ParserFacade {

    private Parser parser;

    public ParserFacade() {
        this.parser = new Parser();
    }

    public void startParse(Scanner sc) {
        parser.startParse(sc);
    }


}
