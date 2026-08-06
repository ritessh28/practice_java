package ExceptionHandling;

public class Exception1 {
    public static void main(String[] args) {
        System.out.println("hello");
        try
        {
            System.out.println(10/0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("statement 3");
    }
}
