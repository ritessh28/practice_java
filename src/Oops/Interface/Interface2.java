package Oops.Interface;
class A
{
    public void d1()
    {
        System.out.println("Inside A  method d1 Demo");
    }
    static void s1()
    {
        System.out.println("Inside A  method s1 Demo");
    }
}
class B extends A
{
    public void d1()
    {
        System.out.println("Inside B  method d1 Demo");
    }
    static void s1()
    {
        System.out.println("Inside B  method s1 Demo");
    }
}

public class Interface2 {
    public static void main(String[] args) {
         A obj=new B();
         obj.d1();
         obj.s1();
         B.s1();

    }
}
