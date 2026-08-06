package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Exception5 {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException, SQLException {
        int[] a =new int[5];
        try
        {
//            System.out.println(a[10]);
            System.out.println(10/0);
        }
//        catch(Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e.getMessage());
//        }
//        catch(FileNotFoundException e)
//        {
//            System.out.println(e.getMessage());
//        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("finished");
    }
}
