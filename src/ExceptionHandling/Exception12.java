package ExceptionHandling;
class KeyNotFoundException extends Exception{
    public KeyNotFoundException(String message){
        super(message);
    }

}
public class Exception12 extends RuntimeException  {
    static void main(String[] args)   {
//        KeyNotFoundException ke;
//        ke=new KeyNotFoundException("key not found");
//        try {
//            throw ke;
//
//        }
//        catch(KeyNotFoundException e){
//            System.out.println(e);
//        }
        Check check=new Check();
        try {
            check.display();
            System.out.println(10 / 0);
        }

        catch (KeyNotFoundException e){
            System.out.println("Inside main method");
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
class Check extends Exception12
{
    KeyNotFoundException ke=new  KeyNotFoundException("key not found");
    public void display() throws KeyNotFoundException
    {
        try {
            throw ke;
        }
        catch (KeyNotFoundException e)
        {
            e.printStackTrace();
            throw ke;



//           System.out.println(e.getMessage());
        }
    }
    }


