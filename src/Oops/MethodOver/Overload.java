package Oops.MethodOver;

public class Overload
{
    public static void m1(int a) {
        System.out.println("int");
    }
    public static void m1(short a) {
        System.out.println("short");
    }
    public static void m1(Object a) {
        System.out.println("object");
    }
    public static void m1(String a)
    {
        System.out.println("String");
    }
//    public static void m1(StringBuilder sb)
//    {
//        System.out.println("string builder");
//    }
    public static void main(String[] args)
    {
        byte b = 5;
        m1(b); // First call
        m1(5); // Second call Integer
        Integer i = 10;
        m1(i); // Third call
        m1("10"); // Fourth call
        m1(null); // Fifth call
    }
}

