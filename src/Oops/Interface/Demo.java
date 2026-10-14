package Oops.Interface;
interface A1
{
    int n=20;
    void m1();

}
interface A2
{
    int n=29;
}
public class Demo implements A1,A2 {
    public static void main(String[] args) {
        A1 d=new Demo();
        d.m1();
        System.out.println(d.n);
        System.out.println(d.n);
        ((Demo) d).m2();
    }
    public void m1()
    {
        System.out.println("m1 method of class Demo");
    }
    public void m2()
    {
        System.out.println("m2 method of class Demo");
    }
}
