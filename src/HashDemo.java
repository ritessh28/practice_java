class Parent
{
    void m1(Object o)
    {
        System.out.println(o.hashCode());
    }
}
class Child extends Parent
{
//    Child(Object o)
//    {
//
//    }
    void m2(Object o)
    {
        System.out.println(o.hashCode());
    }
}
public class HashDemo {
    public static void main(String[] args) {
        Parent obj=new Child();
        System.out.println(obj.hashCode());
        obj.m1(obj);





    }
}
