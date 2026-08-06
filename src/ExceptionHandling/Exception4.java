package ExceptionHandling;

public class Exception4 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
//            System.out.println(e.printStackTrace());
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getName());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getCause());
            System.out.println(e);

        }
        System.out.println("execeution sucessful");
    }
}
