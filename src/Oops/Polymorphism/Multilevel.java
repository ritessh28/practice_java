package Oops.Polymorphism;

public class Multilevel {
    public static void main(String[] args) {
        Parent2 obj=new GrandChild2();
        obj.show();
        Parent2 obj2=new Parent2();
        obj2.show();
        obj=new GrandChild2();
        obj=new Child2();
        obj.show();

    }
}
class Parent2
{
    public  void show()
    {
        System.out.println("show method of class parent");
    }
}
class Child2 extends Parent2
{
    @Override
    public void show()
    {
        System.out.println("show method of class child");
    }
}
class GrandChild2 extends Child2
{
    @Override
    public void show()
    {
        System.out.println("show method of class grand child");
    }
}
