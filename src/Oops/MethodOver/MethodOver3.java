package Oops.MethodOver;
class Test
{
    void m1(int i ,float f)
    {
        System.out.println("int float args method"+i+"  " +f);
    }
    void m1(float f ,int i)
    {
        System.out.println("float-int args method"+i+"  " +f);
    }
}

public class MethodOver3 {
    public static void main(String[]args)
    {
        Test t=new Test();
        t.m1(2,4.6f);
//        t.m1(5,5);
//        t.m1(4.5,8.9); compile time error ambigous method call
    }
}
