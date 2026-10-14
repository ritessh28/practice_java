package Oops.Interface;
interface A3
{
    void m1();
    default void m2()
    {
        System.out.println("inside default method m2 (A3)");
    }
}


interface  B3
{
    void m1();
    default void m2()
    {
        System.out.println("inside default method m2 (B3)");
    }
}

public class InterfaceDemo implements A3,B3{
    public void m1()
    {
        System.out.println("m1 method of class Interface Demo");
    }

    @Override
    public void m2() {
        A3.super.m2();
        B3.super.m2();
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.m1();
        obj.m2();
    }
}
