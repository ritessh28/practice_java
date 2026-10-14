package Oops.MethodOverriding;
class Parent2
{
    public void m1()
    {
        System.out.println("inside method m1 of parent");
    }
    public void add(int a ,int b)
    {
        int c=a+b;
        System.out.println("inside method add of parent");
        System.out.println(c);
    }

}
class Child1 extends Parent2
{
    public void m1()
    {
        System.out.println("inside Child1 method m1 ");
    }
    public void add(int a ,int b)
    {
        int c=a+b+10;
        System.out.println("inside method add of child1");
        System.out.println(c);
    }
}
class Child2 extends Parent2
{
    public void m1()
    {
        System.out.println("inside Child2 method m1 ");
        super.m1();
        this.add(2,3);
    }
}
class Child3 extends Parent2
{
    public void m1()
    {
        System.out.println("inside Child3 method m1 ");
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        Parent2 obj=new Child1();
        obj.add(2,4);
        obj=new Child2();
        obj.add(2,4);
        obj.m1();

    }
}
