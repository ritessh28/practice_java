package Oops.Interface;
interface Test
{
    int s1=10;
    static  void s1()
    {
        System.out.println("Inside static  method s1 Demo");
    }
    private void p1()
    {
        System.out.println("Inside private method p1 Demo");
    }
    default void d1()
    {
        System.out.println("Calling private method through default method d1 ");
        p1();
        System.out.println("Inside default method d1 Demo");
    }
    void i1();

}
class Inter implements Test
{
    public void i1()
    {
        System.out.println("Inside method i1 Demo");
    }
//    private void p1()
//    {
//        System.out.println("Inside private method p1 Inter");
//    }
//    public void d1()
//    {
//        System.out.println("Inside default method d1 Inter");
//    }
//      static void s1()
//      {
//          System.out.println("Inside static method s1 Inter");
//      }

}
public class Interface1 {
    public static void main(String[]args)
    {
        Inter obj=new Inter();
        obj.i1();
//        obj.p1();
        obj.d1();
        Test.s1();



    }

}
