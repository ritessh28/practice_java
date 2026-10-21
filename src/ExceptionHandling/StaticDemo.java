package ExceptionHandling;

public class StaticDemo {
    static
    {
        System.out.println("Inside Static block 1");
    }

    public static void main(String[] args) {
        System.out.println("Inside main method");
        m1();
    }
    static
    {
        System.out.println("Inside Static block 2");
    }
    static void m1()
    {
        System.out.println("Inside m1 method");
    }
}
