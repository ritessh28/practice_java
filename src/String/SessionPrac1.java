package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SessionPrac1 {
    public static void main(String[] args) {
        String s="ja"+"va";//compile time constant resolved at compile time stored in scp
        String s1="ja";
        String h1=s1+"va";//involved with a variable resolved at runtime cause the value of variable is known at runtime
        //heap
        String s2="java";//scp
        System.out.println("java"=="java");
        System.out.println(s==s2);
        System.out.println(h1==s2);
//        String m1="prog";
//        String m2=m1+"ram";
//        System.out.println("program"=="program");
        String m1 = "prog";
        String m2 = m1 + "ram";      // heap object, "program" not in SCP

        String m4 = m2.intern();     // "program" not in SCP -> gets added, m4 = pooled reference
        String m3 = "program";       // already in SCP now -> m3 points to the same pooled object

        System.out.println(m4 == m3); // true
        System.out.println(m2 == m4); // true in modern JVMs (Java 7+), see note below
        System.out.println(m2.hashCode()+" "+m3.hashCode());
        System.out.println(s2.hashCode()+"  "+h1.hashCode());
        String r1="ri";
        String r2=r1+"tesh";
        String r3=r2.intern();
        String r4="ritesh";
        System.out.println(r2==r3);
        System.out.println(r3==r4);
        r2=r2+"Shetty";
        System.out.println(r3);
        System.out.println(r2);
        System.out.println(r2==r3);
        String f4=new String("faah");
        String f1=new String("faah");
        String f2=f1.intern();
        System.out.println(f1==f4);
        String g1="java programming cool";
        char[] arr=g1.toCharArray();
        System.out.println(g1.trim());
        String []str=g1.split("\\s+");
        System.out.println(Arrays.toString(str));
        System.out.println(String.valueOf(89)+80);
        System.out.println(String.join("-",str));
        String k1="- ";
        System.out.println(k1.isEmpty());
        System.out.println(k1.isBlank());





    }
}
