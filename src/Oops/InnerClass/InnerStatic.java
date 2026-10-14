package Oops.InnerClass;
class Outer
{
    private int a=100;
    private static int y;
    int b;
    public void m2()
    {
        System.out.println("inside method m2");
    }
    static class Inner
    {
        static
        {
            y=10;
//            Outer.b=20;

        }
        public Inner(Outer outer)
        {
            this.outer=outer;
//            Outer.super();
        }

        public Inner()
        {

        }
        Outer outer=new Outer();
        static int a;
        static void m1()
        {
            System.out.println("inside static method m1");
            System.out.println(a);
//            System.out.println(outer.b);// not allowed to do this because compiler dont know
            // which outer.b to call as it is static it doesnt contain this it refers to class rather
            // than specific object suppose we have multiple outer object as it doesnt have this
            // it does not understand which outer object to call as it is static and can be called using classname
            System.out.println(y);
            Outer ot=new Outer();// first we are creating object of Outer class Explicitly and telling
            // compiler use this outer object to use its (a) field as there is no confusion between which
            // outer object to use as we have declared inside the static method to runs safely
            System.out.println(ot.a);//
            Inner in=new Inner();// creating object of Inner class when memory is assigned in heap to Inner object
            // before any constructor runs during initialization in a instance field we are creating objevt of
            // outer class and gving it a reference variable which points to it so when inner class gets created
            // a fresh object of outer gets created while initialization so through static class instance field
            // which is a reference to outer class we are able to access it
            System.out.println(in.outer.a);

        }
        void fun()
        {
            System.out.println("inside fun method static");
            System.out.println(y);
            System.out.println(a);
            System.out.println(outer.b);
            outer.m2();
            m1();
            System.out.println(outer.b);

        }

    }
}
public class InnerStatic {
    public static void main(String[] args) {
//        System.out.println(Outer.Inner.a);
//        Outer outer=new Outer();
//        Outer.Inner obj=new Outer.Inner(outer);
//        obj.fun();
//        Outer.Inner obj2=new Outer.Inner();
//        obj2.fun();
//        Outer.Inner.m1();
//        Outer outer=new Outer();
//        Outer.Inner obj=new Outer.Inner(outer);
//        obj.fun();
////        obj.m2();
//        outer.m2();
//        Outer.Inner obj1=new Outer.Inner();
//        obj1.outer.m2();
        Outer.Inner.m1();



    }
}
class BankAccount
{
    private static class InterestCalculator
    {
        static double calulateYearly(double principal, double rate)
        {
            return principal*rate;
        }
    }
    public double computeInterest(double principal)
    {
        return InterestCalculator.calulateYearly(principal,0.09);
    }
}

// Use cases of static nested classes :
/*
 1. As helper class for any outer class.
 2. Builder Design pattern
 3. If you want to have static methods inside a nested class.
 4. Request/Response DTO

*/