package Oops.Constructor;
abstract class A1
{
    A1()
    {
        System.out.println("abstract class constructor");
    }

}
final class B2 extends A1
{
    B2()
    {
        System.out.println("normal class constructor");
    }
}
public class AbstrConst {
    public static void main(String[] args) {
        A1 obj=new B2();

    }
}
