package Oops.Interface;

import javax.crypto.spec.PSource;

interface R
{
    public void method1();
}
interface S
{
    public void method1();
}
interface D1
{
    void d1();

}
interface D2
{
    default void d1()
    {
        System.out.println("d1 method of d2");
    }
}
public class SameMethod implements R,S,D1,D2 {
    @Override
    public void method1() {
        D2.super.d1();
        System.out.println("common implementation for both interface");
    }

    public static void main(String[] args) {
        SameMethod obj =new SameMethod();
        obj.method1();
        obj.d1();

    }

    @Override
    public void d1() {
        System.out.println("d1 method of d1 interface");
    }
}
