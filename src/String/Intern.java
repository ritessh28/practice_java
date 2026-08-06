package String;

public class Intern {
    static void main(String[] args) {
        String s1=new String("java");
        String s2=new String("java");
        String s3=s1.intern();
        String s4="java";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s3==s4);
        System.out.println( );
        String s5=s4.intern();
        System.out.println(s4==s5);
        System.out.println(s3==s5);

    }
}
