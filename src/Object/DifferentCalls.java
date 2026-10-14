package Object;

public class DifferentCalls {
    public static void main(String[] args) {
//        int a=4,b=5;
//        System.out.println("before:a = "+a+" ,b = "+b);
//        increment(a,b);// java only supports call by value and does not support call by reference
//        System.out.println("after:a = "+a+" ,b = "+b);
        Reference obj=new Reference(3,4);
        System.out.println("before:a = "+obj.a+" ,b = "+obj.b);
        obj.m1(obj);
        System.out.println("after:a = "+obj.a+" ,b = "+obj.b);

    }
    public static void increment(int a,int b)
    {
        a=a+1;
        b=b+1;
    }
}
class Reference
{
    int a,b;
    Reference(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void m1(Reference r)//obj is passed as value to this method as obj is reference variable so memory address
     // is passed so now both r and obj contains the same memory address(reference)
    {
        r.a=r.a+10;// here r reference variable is created and both obj and r points to the same object in heap
        r.b=r.b+10;// so changes done through one reference variable can affect the object because both points to same
    }
}
