package String;

import java.util.Arrays;

public class Clone {
    public static void main(String[] args) {
        String []str={"a","b","c"};
        String []str1={"a","b","c"};
        String []str2=str1;
        String []str4=str1.clone();
        String []str5= Arrays.copyOf(str,5);
        System.out.println(str==str1);//using diffrent string object
        System.out.println((str2==str1));//using ==
        System.out.println((str4==str1));//using clone
        String s1="a";
        System.out.println(s1==str1[0]);//using str1 without new keyword
        String s2=new String("a");
        System.out.println(s2==str1[0]);//using str1 with new string object
        System.out.println(s1==str[0]);//using str without new keyword
        System.out.println(s1==str5[0]);//using copy of string without new keyword string
        System.out.println(Arrays.toString(str5));
    }
}
