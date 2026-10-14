package Oops.MethodOver;
class MultipleMethods
{
    public void m1(int i)
    {
        System.out.println("Inside int args method "+i);
    }
    public void m1(double f)
    {
        System.out.println("Inside double args method "+f);
    }
    public void m1()
    {
        System.out.println("inside normal method");
    }
//    public int m1(int i)
//    {
//        System.out.println("inside method 1 int return type");
//    }
}
public class MethodOver1 {
    public static void main(String[]args)
    {
        MultipleMethods m = new MultipleMethods();
        m.m1();
        m.m1('a');
        m.m1(3);
        m.m1(10.7f);

    }
}