package String;

public class Equality {
    public static void main(String[] args) {
        String s="ritesh";
        String m=s.concat("");
        System.out.println(s==m);//true
        String n=m+" ";
        System.out.println(n==m);
        System.out.println(s.concat(""));
        String a="a";
        String b="b";
        String c=a+b;
        System.out.println(c);
        c=c+a;
        String m1="hello";
        String n3=m1+"hi";
        String n1="hello"+"hi";
        String n2="hellohi";
        System.out.println(n1==n2);
        System.out.println(n2==n3);
        int num1=10;
        System.out.println(num1==10);
        String s1="java";
        String s2=new String("java");
        System.out.println(s1==s2);



    }
}
