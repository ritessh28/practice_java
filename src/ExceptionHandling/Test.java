package ExceptionHandling;

public class Test extends Throwable {
    public Test()
    {

    }
    public Test(String msg)
    {
//
        super(msg);
        System.out.println(msg);
    }
    public static void main(String[] args) throws Throwable
    {
        Test t=new Test();
        throw new Test("cannot throw");
    }
}
