package Oops.Interface;
interface AB
{
     default void m1()
     {
         System.out.println("m1 default method");
     }
     public void m2();
}
class Demo1 {
    void m1()
    {
        System.out.println("m1 method of class demo1");
    }

}
public class InterfacevsClass extends Demo1 implements AB {
    public static void main(String[] args) {
        InterfacevsClass obj=new InterfacevsClass();
        obj.m1();// priority is given to class method first if we override then that method will be called
        obj.m2();
    }

    @Override
    public void m1() {
        super.m1();
        AB.super.m1();

    }

    //    @Override
//    public void m1()
//    {
//        System.out.println("m1 overriden method");
//    }
    @Override
    public void m2()
    {
        System.out.println("m2 method ");
    }
}
