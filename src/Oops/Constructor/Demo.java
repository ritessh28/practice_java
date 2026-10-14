package Oops.Constructor;

public class Demo {
    int a;
    String s;
    char c;
//    public Demo() {
//        System.out.println("no arg constructor");
//    }
//
//    public Demo(int a)
//    {
//        System.out.println("parameterized constructor of type int");
//    }

    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.s);
        System.out.println(d.a);
        System.out.println(d.c);



    }
}
