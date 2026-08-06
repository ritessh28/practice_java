package Oops.Constructor;
class ParentConstructor
{
    ParentConstructor()
    {
        this(5);
//        super();
        System.out.println("Parent Constructor");
    }
    ParentConstructor(int a)
    {
        System.out.println("Parent Constructor(int a)");
    }
}
class ChildConstructor extends ParentConstructor
{
    ChildConstructor()
    {
//        super();
        this(105);
        System.out.println("Child Constructor");
    }
    ChildConstructor(int a)
    {
//        super(5);
//        this();
          super();
        System.out.println("Child Constructor(int a)");
    }
}
public class Constructor1 {
    public static void main(String[] args)
    {
        ChildConstructor obj = new ChildConstructor();

    }
}
