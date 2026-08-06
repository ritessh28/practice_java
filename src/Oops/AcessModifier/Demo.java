package Oops.AcessModifier;

import pack1.AccesM;

//class A
//{
//    protected void m1()
//    {
//        System.out.println("Inside method m1");
//    }
//}
//class B extends A
//{
//    protected void m1()
//    {
//    System.out.println("Inside method m1 B");
//    }
//}
//class C
//{
//    protected void m1()
//    {
//        System.out.println("Inside method m1 C");
//    }
//}
//protected class a
//{
//
//}
public class Demo {
    private void m7()
    {
        AccesM a1=new AccesM();
//        a1.m3();
    }
    public static void main(String[]args)
    {
//        A a=new B();
//        a.m1();
//        C c=new C();
//        c.m1();

    }
    public void m1()
    {
        System.out.println("Inside method m1 Demo");
    }
    protected void m2()
    {
        System.out.println("Inside protected  method m2 Demo");
    }
    void m3()
    {
        System.out.println("Inside default method m3 Demo");
        m5();
    }
    private void m5()
    {
        System.out.println("Inside private  method m5 Demo");
    }


}
