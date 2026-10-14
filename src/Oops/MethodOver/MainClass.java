package Oops.MethodOver;
class SuperClass
{
    void superClassMethod(Number n)
    {
        System.out.println("From Super Class");
    }
}

class SubClass extends SuperClass
{
    void superClassMethod(float d)
    {
        System.out.println("From Sub Class");
    }
}

public class MainClass
{
    public static void main(String[] args)
    {

        SuperClass sub = new SubClass();

        sub.superClassMethod(123321);
        SubClass sb=new SubClass();
        sb.superClassMethod(2293939.00f);
    }
}
