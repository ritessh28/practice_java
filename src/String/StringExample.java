package String;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="ra";
        String s2=s+"ve";//heap
        String s5="rave";
        System.out.println(s2);
        String s3=s2.intern();//scp
        System.out.println(s2==s3);
        String m1 = "prog";
        String m2 = m1 + "ram";
        // heap object, "program" not in SCP
        int n;
        String m4 = m2.intern();  //scp   // "program" not in SCP -> gets added, m4 = pooled reference
//        String m3 = "program";
        System.out.println(m2==m4);
        String k1=new String("ritesh");
        String k2=k1.intern();
        System.out.println(k1==k2);
        System.out.println("enter a name:");
        n=sc.nextInt();
    }
}
