package ExceptionHandling;

public class Exception11 {
   public  static void main(String[] args) {
       System.out.println(10/0);//checked in run time as it is unchecked exception
       throw new ArithmeticException("/ by zero");//checked in compile time
//       System.out.println("Hello World");//unreachable statement


    }
}
