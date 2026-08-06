package String;

public class Methods {
    public static void main(String[]args)
    {
        String s1=new String("ritesh shetty");
        String s2=new String("ramesh");
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s1.getBytes());
        s1.charAt(0);
        s1.chars();
        s1.compareTo(s2);
        System.out.println(s1.codePointAt(2));
        String s3=s1.concat(s2);
        System.out.println(s1);
        System.out.println(s3);
        s1=s1+"hello";
        System.out.println(s1);

    }
}
