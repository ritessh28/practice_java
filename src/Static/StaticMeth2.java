package Static;
public class StaticMeth2 {
    static
    {
        m3();
    }
    public void m1()
    {
        System.out.println("inside method m1");
    }
    public void m2()
    {
        System.out.println("inside method m2");
    }
    public static void m3()
    {
        System.out.println("inside method m3");
        m4();

    }
    public static void m4()
    {
        System.out.println("inside method m4");
    }
    public static void main(String[] args) {
        System.out.println("inside main method");


    }

}
