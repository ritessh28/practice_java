package Oops.Constructor;
class P
{
    P()
    {
        this("ritesh");
        System.out.println("parent non parameterized constructor");
    }
    P(String s)
    {
        this(7);
        System.out.println(" parent parameterized constructor of type string");
    }
    P(int a)
    {
        System.out.println("parent Parameterized constructor of type int");
//        this();
    }
    void add()
    {
        System.out.println("add method of parent class");
    }
}
class C extends P
{
    C()
    {

        this(5);
        System.out.println( "child non parameterized constructor");
        super.add();

    }
    C (int a)
    {
        this("String");
        System.out.println( "child parameterized constructor of type int");
    }
    C(String s)
    {

        super();
        System.out.println( "child parameterized constructor of type string");


    }
}


public class Cosntructor4 {
    public static void main(String[] args)
    {
        C c=new C();

    }
}
