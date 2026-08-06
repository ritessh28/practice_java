package ExceptionHandling;

import java.io.IOException;
import java.io.PrintWriter;

public class Exception3 {
    public static void main(String[] args)  {
            try {
                PrintWriter pw = new PrintWriter("abcd.txt");
                pw.println("abcd");
            }
            catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.toString());
            }
    }
}
