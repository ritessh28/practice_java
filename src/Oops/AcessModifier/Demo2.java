package Oops.AcessModifier;
class Test
{
    Test t=new Test();
    Demo d3=new Demo();
    void display()
    {
        d3.m1();
    }

}

public class Demo2  {
    public void m1()
    {
        System.out.println("Inside method m1 demo2");
    }
    protected void m2()
    {
        System.out.println("Inside method 2 demo2");
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.m1();
        d.m2();

        d.m3();
//        Demo d2=new Demo2();
//        d2.m1();
//        d2.m2();


    }
}
