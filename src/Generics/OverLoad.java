package Generics;

public class OverLoad {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        c1.print(20);
        c1.print(new Object());
        c1.print("String");
        c1.print(new StringBuffer("java"));
        c1.print(32.45);
    }

}
class Calculator
{
    public void print(Integer i)
    {
        System.out.println("integer:"+i);
    }
    public <T> void print(T a)
    {
        System.out.println("any value: "+a+" "+a.getClass().getName());
    }
    public void print(String s)
    {
        System.out.println("string:"+s);
    }
    public void print(StringBuffer sb)
    {
        System.out.println("StringBuffer: "+sb);
    }
}