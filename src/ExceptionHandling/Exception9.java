package ExceptionHandling;

public class Exception9 {
    public static void main(String[] args) {
      System.out.println(10/0);//handled by main method
//        throw new ArithmeticException("/ by zero");//handled by programmer and throw handover to jvm manually
    }
}
