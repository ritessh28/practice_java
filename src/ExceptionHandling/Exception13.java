package ExceptionHandling;

import java.io.IOException;
import java.io.PrintWriter;

public class Exception13 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello World");

    }
}
