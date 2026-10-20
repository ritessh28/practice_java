package Object;

public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        int a = 200;
        Integer b = a;
        //behind the scene it does autoboxing like this => Integer b=Integer.valueOf(a);
        // first it was Integer b=new Integer(a);=>deprecated
        Integer c = 300;
        System.out.println(a == b);//true
        System.out.println(b == c);// false because two different integer reference variable  point to different objects in heap
        Integer x = 500;
        // or Integer x=Integer.valueOf(500);
        // behind the scene the above thing happens
        System.out.println(x);
        int y = x;//unboxing
        // behind the scene unboxing => y=x.intValue()
        System.out.println(y = x.intValue());
        System.out.println(y == x);
        System.out.println(AutoBoxingUnboxing.getValue(x));
        System.out.println(AutoBoxingUnboxing.getval(a));
        Integer nu = null;
//        int p=nu;// null pointer exception
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "nu" is null
//        System.out.println(p);
        Integer n1 = Integer.valueOf(10);// autoboxing
        Integer n2 = 20;
        int add = n1.intValue() + n2.intValue();//unboxing
        System.out.println(add);
    }

    static int getValue(int x)//when passing Integer object its unboxing x=objectpassed.intvalue();
    {
        return x;
    }
    Integer b1=10;
    int c1=2;
    int add=b1+c1;//b1.intvalue();
    static int getval(Integer n)// here if im passing primitive int its autoboxing n=Integer.valueOf(primitive)
    {
        return n;
    }
}
// applicable for
//1. assigment
//2. methods
//3. arithmetic operations