package Oops.Polymorphism;

public class Covariant2 {
    public static void main(String[] args) {
//        Object OBJ=new Object("string");
        Parent3 obj=new Parent3();
        System.out.println(obj.returnString());
        obj=new Child3();
        System.out.println( obj.returnString());
        System.out.println(obj.returnParent());


    }
}
class Parent3
{
    public Object returnParent()
    {
        return new Object();
    }
    public Object returnString()
    {
        return new Object();
    }
}
class Child3 extends Parent3
{
    @Override
    public Parent3 returnParent()
    {
        return new Parent3();
    }
    @Override
    public String returnString()
    {
        return new String("JAVA");
    }
}
