package Generics;

public class Static {
   public static void main(String[] args) {

    }
}
class P1<T>
{
    T value;
//    static T name; we cannot use type parameter for static
    public static <T> void display(T a)
    {
        System.out.println(new P1<Integer>().value);
    }
}
// static members cannot use type parameter where as
// static methods can use type parameter