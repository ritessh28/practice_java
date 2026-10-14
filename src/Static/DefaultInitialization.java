package Static;
class Demo
{
    static
    {
        System.out.println("static block of Demo");
    }
    static final int  m=100;
//    static final int =Demo.someStaticMethod();
    static final int someStaticMethod()
    {
        System.out.println("static method");
        return 100;
    }
    static final void  someStaticMethod2()
    {
        System.out.println("somestatic 2");
    }
    static final int n=someStaticMethod();

}
public class DefaultInitialization {
    private int b;
    private static int m;
    public static int a;// default value is assigned when class is loaded and in the linking process at step 2
    //preparation stage static variables are allocated memory and assigned default values
    static String s1="java";
    final static double d=1.05;
    private static void show()
    {
        int a;

    }
    public void m1()
    {
//        private int a;
//        public int a-10;
        int a;
//        System.out.println(a);// gives compile time error because local variable should be initialized jvm does
        // not provide default values to local variables

    }
    static
    {
        System.out.println("Default Initialization static block executed");
//        System.out.println(b);
    }
    public static void main(String[] args) {
//        System.out.println(DefaultInitialization.a);//static block executes because class is loaded at first time
        // at the above statement  when, a is initialized for first time
//        System.out.println(DefaultInitialization.a);
        // static block is executed when the class is loaded for first time when we are accessing the variable
        // a for the second time as the above statement the static block doesn't execute once again
        // because it was already loaded first time when line 10 was executed
//        DefaultInitialization obj=new DefaultInitialization();// class loaded but static block doesn't execute
//        obj.m1();
//        System.out.println(DefaultInitialization.s1);// class loaded
//        System.out.println(DefaultInitialization.d);
        // even though static variable is final constant value cannot be changed its fixed still class loads because
        //main method is executed and to execute main method the class containing main method needs to be loaded
        // so at it is already loaded static block anyway executes for the above defaultinitialization class
//        Demo d=new Demo();
        System.out.println(Demo.m);
        //DefaultInitialization class is loaded so it prints DE static block executed
        // but as Demo class isnt loaded it doesnt print Demo static block executed
        // because static variable is final and  follows constant inlining behavior property+ constant literal
        System.out.println(Demo.someStaticMethod());//class loads





    }
}
