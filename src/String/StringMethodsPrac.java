package String;

import Static.StackOverflow;

import java.util.Arrays;

public class StringMethodsPrac {
    public static void main(String[] args) {
        String s1="ritesh          ";
        String s2="    ";
        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s1.replaceFirst("ri","xy"));
        System.out.println(s2.isBlank());
        System.out.println(Arrays.toString(s2.getBytes()));
//        System.out.println(s1.getBytes());
        System.out.println(s1.replaceFirst("ri","sm"));
        System.out.println(s1.intern());
        String s3=s1.intern();
        System.out.println(s1==s3);
        String m1=new String("hello");
        String m2=m1.intern();
        System.out.println(m1==m2);
        System.out.println(s1.trim());
        System.out.println(s1);
        String s7="hi how are you man - im fine budyy";
        String [] s5= (s7.split(" "));
        System.out.println(s5.toString());
        System.out.println(Arrays.toString(s5));
        System.out.println(s1.equals(s7));
        System.out.println(s1.indexOf("i"));
        System.out.println(s1.lastIndexOf("sh"));
        byte []value={90,100,97,98,99};
        System.out.println(Arrays.toString(value));
        String str=new String(value);
        System.out.println(Arrays.toString(str.toCharArray()));
        for(char s:str.toCharArray())
        {
            System.out.println(s);
        }
        char []arr={'1','2','3','4','s'};
        String str2=new String(arr);
        System.out.println(str2);
        byte []result=str2.getBytes();
        for(byte b:result)
        {
            System.out.println(b);
        }
        byte b1='a';
        System.out.println(b1);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.indexOf("r"));
//        s1.compareToIgnoreCase()


    }
}
