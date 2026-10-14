package Static;

public class StaticTwo {
    static int a;
    static
    {
        a=100;
        System.out.println("inside static block value is "+a);
    }
    static void m1()
    {
        a=200;
    }
    StaticTwo()
    {
        a=300;
        System.out.println("inside constructor block value is "+a);
    }
    public static void main(String[] args) {
//        StaticTwo obj=new StaticTwo();
//        obj.m1();
        StaticTwo.m1();
        System.out.println(StaticTwo.a);
        
    }
}
