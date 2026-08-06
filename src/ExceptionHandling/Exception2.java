package ExceptionHandling;

public class Exception2 {
    public static void main(String[] args) {
        int []arr=new int[10];
        try {
            System.out.println("statment 1");
          System.out.println("value of arr[10] is"+arr[10]);
          System.out.println("statement 2");
          System.out.println("statement 3");
        }
        catch(ArithmeticException e) {
            System.out.println(10/0);
            System.out.println("Arithmetic Exception"+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds"+e.getMessage());
            System.out.println(10/0);
        }
        System.out.println("statement 4");
    }
}
