package Oops.Constructor;

public class SuperParent {
//    SuperParent()
//    {
//        System.out.println("no -arg SuperParent Constructor");
//        this(5,"ramesh");
//    }
    public SuperParent(int i,String s)
    {
        System.out.println("2 parameter int-string SuperParent Constructor");
    }
}
class SuperChild extends SuperParent
{
    SuperChild()
    {
        super(5,"ritesh");
        System.out.println("no -arg SuperChild Constructor");
    }
    SuperChild(int i)
    {
        super(5,"ritesh");
        System.out.println("1 parameter int SuperChild Constructor");
    }

    public static void main(String[] args) {
        SuperChild sc=new SuperChild();

    }
}
