package Generics;

public class GenericsMethods {
    public static void main(String[] args) {
        System.out.println(returnValue(5));
//        System.out.println(pair("ra,esj","kaka"));
//        pair("ramesh","kaka");
        pair(20.5,2);

    }
    public static int returnValue(int x)
    {
        return x;
    }
    public static <T extends Number> T returnVal(T x) {
        return x;
    }
    public static <T,U extends Number> void pair(T x,U y)
    {
        System.out.println(x+" , "+y);
    }
}
