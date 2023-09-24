import boom.grammar.BoomLexer;
import boom.grammar.BoomParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;

public class RunCompiler {

    public static void main(String[] args) throws IOException {
        String infile;
        String outfile;

        System.out.println("What file do you want to compile?");
        Scanner scanner = new Scanner(System.in);
        infile = scanner.nextLine();

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(infile));
        BoomLexer lexer = new BoomLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BoomParser parser = new BoomParser(tokens);
        ParseTree tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new CompileBoom(), tree);
        // Writer writer = new OutputStreamWriter(new FileOutputStream(outFile), "US-ASCII");
    }

}
