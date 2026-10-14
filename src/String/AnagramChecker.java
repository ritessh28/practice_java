package String;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {

        System.out.println(StringIdentical("listen", "silent"));
        System.out.println(StringIdentical("hello","hewor"));
        String s="hello";
        s.toUpperCase();
        s.trim();
        System.out.println(s.replace('l','x'));
        System.out.println(s);
    }

    public static boolean StringIdentical(String str1, String str2)
    {
        int []count=new int[128];// array for storing value at char ascii index
        if(str1==null||str1.length()!=str2.length())
            return false;
        for(char c:str1.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                count[Character.toLowerCase(c)]+=1;
            }
        }
        for(char c:str2.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                count[Character.toLowerCase(c)]-=1;
            }
        }
//        System.out.println(Arrays.toString(count));
        for(int n:count)
        {
            if(n!=0)
                return false;
        }
        return true;
    }
}

