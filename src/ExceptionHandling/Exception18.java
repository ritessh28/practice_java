package ExceptionHandling;

import java.util.Objects;

public class Exception18 {
    public static void main(String[] args)
    {
        int []a=new int[10];
//        System.out.println(a[20]);throws null pointer exception
//        String s=null;
//        System.out.print(s+"my name is ");//Null pointer exception
        String s=new String("Shankar");
        Object o=(Object) s;
//        String s1=new Object();
        Object o2=new String("Shankar");
        System.out.println(o2);
        Object o3=new Object();
        //String s1=(String)o3; ClassCastException



    }
}
