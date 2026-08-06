package Abstraction;
abstract class Demo
{
    abstract interface Writting {
        void write();
    }
    abstract void abstractMethod();
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
    void defaultMethod()
    {
        System.out.println("default Method");
    }
}
public class Abstract1 extends Demo implements Demo.Writting {
    public void abstractMethod()
    {
        System.out.println(" inside abstract Method");
    }
    public void write()
    {
        System.out.println("Inside interface write");
    }
    static void main(String[] args)
    {
       Abstract1 ab = new Abstract1();
       ab.abstractMethod();
       staticMethod();
       ab.defaultMethod();
       ab.write();
    }
}
