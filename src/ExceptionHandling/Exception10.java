package ExceptionHandling;

public class Exception10 {
    //static ArithmeticException ae=new ArithmeticException();
    static ArithmeticException be;
    public static void main(String[] args) {
           // throw ae; object is created so show normal arithmetic exception message
        throw be;
        // throw null pointer exception as object is not assigned with any memory or
        //not created any object using new keyword  be is only a reference variable

    }
}
