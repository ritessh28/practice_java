package Object;

import java.util.Arrays;

class A extends Object
{

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    int num;

    public A(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "value of num is"+num;
    }
//    public A() {
//        super();
//    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((A)obj).num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
class Parent
{

}
class Child extends Parent
{

}
public class Methods {
    public static void main(String[] args) throws CloneNotSupportedException {
        A obj=new A(2);
        A obj2=new A(7);
//        try {
//            System.out.println(obj.clone());
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
        String str[]=new String[20];
        System.out.println(args.clone());
//        System.out.println(str.clone(args));
//        System.out.println(obj.clone());
        String []s1=new String[]{"r","i"};
        String []s2=s1.clone();
        A obj4=new A(6);
        obj4=obj;
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj4==obj);
        System.out.println(obj);
        System.out.println(obj.equals(obj2));
        A obj5=new A(6);
        System.out.println(obj4.num);
        System.out.println(obj4.toString());
        String m1="m"+null+"c";
        System.out.println(m1);
        System.out.println("abc".equals(new StringBuilder("abc")));
        System.out.println("abc".equals(null));
        System.out.println("abc".contentEquals(new StringBuilder("abc")));
        int []arr=null;
//        for(int x:arr)
//        {
//
//        }
        int[] a = {1, 2, 3};
        for (int x : a) {
            x = x * 2; }
        System.out.println(Arrays.toString(a));
        Object o=null;
        System.out.println(o instanceof Object);
        Parent p = new Parent();
//        Child c = (Child) p;
//        Object s = (String) (Object) 5;
//        Arrays
        String f1=null;
        f1+=null;
        System.out.println(f1);
//        String d2=null+null;



    }

}

