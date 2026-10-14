package ExceptionHandling;

public class excp1 {
    public static void main(String[] args) {
        try
        {
            int x=10/0;
        }
        catch (ArithmeticException ae)
        {
            System.out.println("arithmetoc exception");
        }
        catch(Exception e) {
            System.out.println("some exception");
        }
    }
}
