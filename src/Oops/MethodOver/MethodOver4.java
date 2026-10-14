package Oops.MethodOver;
class Methods
{
//    void m1(StringBuffer sb)
//    {
//        System.out.println("Inside method m1 of StringBuffer "+sb);
//    }
    void m1(String s)
    {
        System.out.println("Inside method m1 of String "+s);
    }
    int  m1(Object o)
    {
        System.out.println("inside method m1 of type Object");
        return 2;
    }
}
public class MethodOver4 {
    public static void main(String[] args)
    {
        Methods obj=new Methods();
        obj.m1(new StringBuffer("ritesh"));
        obj.m1("hello");
        Object obj1=null;
        obj.m1(obj1);
        obj.m1(null);
       // java: reference to m1 is ambiguous
        //both method m1(java.lang.StringBuffer) in Oops.MethodOver.Methods and method m1(java.l
    }
}
