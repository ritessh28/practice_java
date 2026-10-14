package Static;
class Parent
{
     int a=100;
    static void p1()
    {
        System.out.println("p1 method of parent class");
    }
    void m1()
    {
        this.a=200;
        System.out.println("m1 method of parent class");
    }
}
class Child extends Parent
{
    static void p1()
    {
        System.out.println("p1 method of child class");

    }
    void m1()
    {
//        super.m1();
        this.a=300;
        System.out.println("m1 method of child class");
    }
    void m2()
    {
        System.out.println("m2 method of child class");
    }
}
public class One {
    public static void main(String[] args) {
//        Parent p=new Child();
//        Child c=new Child();
//        c.p1();
//        p.p1();
//        Child.p1();
//        Parent.p1();
//        c.a=200;
//        System.out.println(c.a);
//        c.m1();
//        ((Parent) p).m1();
        Parent obj=new Child();
        obj.m1();
        obj.p1();
        Child.p1();
        ((Child)obj).m2();





    }
}
