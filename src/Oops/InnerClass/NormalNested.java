package Oops.InnerClass;
class Outer1
{
    private int n1=100;
    int x=20;
    public void m1()
    {
        System.out.println("method m1 of class Outer1");
    }
    class Inner1
    {
        Outer1 outer;// by default java compiler does this
        public Inner1()
        {
            super();
        }
        int x=30;
        public void fun()
        {
            outer=new Outer1();
            System.out.println(x);
//            System.out.println(Outer1.super());
            System.out.println(Outer1.this.x);// explicitly we are saying use x of Outer class
            System.out.println(outer.x);
            System.out.println(this.x);//use x of Inner class
            System.out.println(outer.n1);
        }
        static void s1()// before java 16 we were not allowed to use static method but after that its ok
        {
            System.out.println("static method of inner class");
        }
    }
}
public class NormalNested {
    public static void main(String[] args) {
//        Outer1.Inner1 obj=new Outer1().new Inner1();
//        obj.fun(); we can use this syntax but using this wont create object of outer class
        //it creates the object of Outer.inner class only not outer class
        // so we cannot access methods of outer class
        //obj.m1();
        Outer1 obj=new Outer1();// recommended cause we can access members of outer class also
        Outer1.Inner1 inner=obj.new Inner1();
        inner.fun();
        obj.m1();
        inner.s1();

    }


}
