package String;

public class MoreMethods {
    public static void main(String[]args) {
        String s1 = "hello";
        String s2 = "hi";
        String s4=s1+s2;
        String s3="hi";
        System.out.println(s2==s3);
        String s6="hellohi";
        String s7=new String("hellohi");
        System.out.println(s4==s6);
        System.out.println(s7==s4);
        String s8="hellohi";
        System.out.println(s8==s6);
        String m1="java";
        String m2="lang";
        m1.concat(m2);
        m1=m1+m2;
        System.out.println(m1);
        System.out.println(m1==m2);
    }
}
