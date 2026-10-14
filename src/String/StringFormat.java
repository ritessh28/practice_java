package String;

public class StringFormat {
    public static void main(String[] args) throws NullPointerException {
        String  s1=String.format("my name is %s and my age is %d","ritesh",18);
        String s2=String.format("age is %d",18);
        String str3=s1+s2;
        String s4=null;
        String s5="";
        String s6="aditya";
        String s7="ADITYA";
        System.out.println(s1);
        System.out.println(s1.substring(3));
        System.out.println(s2.substring(4,9));
        System.out.println(s1.contains("19"));
        System.out.println(s1.contains("18"));
        System.out.println(s1.isEmpty());
//        System.out.println(s4.isEmpty());
        System.out.println(s5.isEmpty());
        s6.replace('a','r');
        System.out.println(s6.replace('a','r'));
        System.out.println(s6);
        System.out.println(s6.equalsIgnoreCase(s7));
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.valueOf(20));
        System.out.println(s1);
        String s8=String.valueOf(60);
        String s9="    hello how w      ";
        System.out.println(s9.trim());
        System.out.println(String.format("my name is %s and %s",s6,s7));

    }
}
