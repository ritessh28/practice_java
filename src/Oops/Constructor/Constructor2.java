package Oops.Constructor;
class Parent
{
    Parent()
    {
        System.out.println("no arg constructor of parent");
    }
    Parent(int k)
    {
        k=10;
        System.out.println("1 arg constructor of parent");
    }
}
class Child extends Parent
{
   Child(int i)
   {
       super(20);
       System.out.println("1 arg constructor of child");
   }
   Child()
   {
       System.out.println("no arg constructor of child");
   }
}
public class Constructor2 {
    public static void main(String[] args) {
        Parent c1=new Child();
    }

}
