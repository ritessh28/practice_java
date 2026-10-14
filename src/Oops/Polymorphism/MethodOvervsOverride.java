package Oops.Polymorphism;
class Parent
{
    void show(int x)
    {
        System.out.println("parent int method");
    }
    void demo()
    {
        System.out.println("demo method of child");
    }

    public void show(double v) {

    }
}
class Child extends Parent
{
    public void show(double b)
    {
        System.out.println("child double method");
    }
//    void show(int i)
//    {
//        System.out.println("child class int method");
//    }
    void demo()
    {
        System.out.println("demo method of child");
    }
}
public class MethodOvervsOverride {
    public static void main(String[] args) {
        Parent p=new Child();
        p.show(2);
        p.show(2.4d);
        p.demo();


    }
}
