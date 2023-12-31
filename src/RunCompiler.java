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

        CompileBoom compiler = new CompileBoom();

        System.out.println("What file do you want to compile?");
        Scanner scanner = new Scanner(System.in);
        infile = scanner.nextLine();

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(infile));
        BoomLexer lexer = new BoomLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BoomParser parser = new BoomParser(tokens);
        ParseTree tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(compiler, tree);

        System.out.println("What do you want the compiled file to be called?");
        scanner = new Scanner(System.in);
        outfile = scanner.nextLine();

        Writer writer = new OutputStreamWriter(new FileOutputStream(outfile), "US-ASCII");
        writer.write(compiler.getCompiledCode());
        writer.flush();
        writer.close();
    }

}
