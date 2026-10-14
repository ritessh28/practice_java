package Static;

public class StaticInitialization {
    static int a=10,b;
    // static block will only run once when the 1st object is created
    // ie when class is loaded for the first time
    static
    {
        a=10;
        b=10+1;
        System.out.println("inside static block");
    }
    public static void main(String[] args) {
            StaticInitialization obj=new StaticInitialization();
           System.out.println(StaticInitialization.a+" "+StaticInitialization.b);
           StaticInitialization obj2=new StaticInitialization();
          System.out.println(StaticInitialization.a+" "+StaticInitialization.b);
          StaticInitialization.b+=10;
           System.out.println(StaticInitialization.a+" "+StaticInitialization.b);

    }
    static
    {
        System.out.println("inside static block after main");
    }
    static void m1()
    {
        System.out.println("inside static method m1");
    }


}
