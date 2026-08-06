package Oops.MethodOver;
class Demo
{
    public void m1(String s)
    {
        System.out.println("inside m1 method of String"+s);
    }
    public void m1(Object o)
    {
        System.out.println("inside m1 method of object"+o);
    }
}
public class MethoOver2 {
    public static void main(String[] args)
    {
        Demo d = new Demo();
        d.m1("string");
        d.m1(new MethoOver2());
        d.m1(2);
        d.m1(21.5);
        d.m1(null);
    }
}
