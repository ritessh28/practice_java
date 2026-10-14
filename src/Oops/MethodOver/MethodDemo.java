package Oops.MethodOver;

public class MethodDemo {
    public void m1(int a,int b)
    {
        int c=a+b;
        System.out.println(c);
    }
    public void m1(int a,int b,String c)
    {
        String  m=a+b+c;
        this.m1((byte)3);
        System.out.println(m);
    }
    public void m1(String a)
    {
        System.out.println(a);
    }
    public void m1(String a,int  c)
    {
        System.out.println(c+a);
    }
    public void m1(int a,String c)
    {
        System.out.println(c+a);
    }
    public void m1()
    {
        System.out.println("no args");
    }
    public void m1(byte b)
    {
        System.out.println(b);
    }
    public void m1(double f)
    {
        System.out.println(f);
    }
    public static void main(String[] args) {
        MethodDemo obj=new MethodDemo();
        Byte b=10;
        obj.m1(b);
        obj.m1(3.1234);


    }
}
