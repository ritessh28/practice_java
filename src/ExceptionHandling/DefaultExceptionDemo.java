package ExceptionHandling;

public class DefaultExceptionDemo {
    public void doStuff()
    {
        doMoreStuff();
    }
    public void doMoreStuff()
    {
            System.out.println(10/0);
    }
    public static void main(String[] args) {
        DefaultExceptionDemo demo = new DefaultExceptionDemo();
        demo.doStuff();

    }

}
