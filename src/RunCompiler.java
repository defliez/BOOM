import java.util.Scanner;

public class RunCompiler {

    public static void main(String[] args) {
        String infile;
        String outfile;

        System.out.println("What file do you want to compile?");
        Scanner scanner = new Scanner(System.in);
        infile = scanner.nextLine();

        System.out.println(infile); // debug
    }

}
