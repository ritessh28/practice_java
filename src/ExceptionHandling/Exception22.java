package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception22 {
    public static void main(String[] args)
    {
        try
        {
            int a=0;
//            System.out.println(a/10);
            throw new IOException("file not found");

        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException | IOException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
