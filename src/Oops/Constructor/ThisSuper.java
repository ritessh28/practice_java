package Oops.Constructor;
class ParentM
{
    ParentM()
    {
        this(4,"mesh");
        System.out.println("child class no-arg constructor");//2
    }
    ParentM(int a,String b)
    {
        System.out.println("child class 2-arg constructor");//1
    }
    ParentM(int i)
    {
        this();
        System.out.println("child class 1-arg constructor");//3
    }
}
class ChildM extends ParentM
{
    ChildM()
    {
        this(5);
        System.out.println("child class no arg constructor");//5
    }
    ChildM(String s,char c)
    {
        this();
        System.out.println("child class 2-arg constructor");//6
    }
    ChildM(int i)
    {
//        this("ramesh",'a');
        super(5);
        System.out.println("child class 1-arg constructor");//4
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        ChildM ch=new ChildM("RAMESH",'C');
//        ParentM pm=new ParentM(3);
    }
}
