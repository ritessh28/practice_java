package String;

import java.util.Arrays;

public class ReverseWordsWithSymbols {
    public static void main(String[] args) {
        reverseWords("hello world!");
    }
    public static void reverseWords(String str)
    {
        String []str1=str.trim().split("\\s+");
        StringBuffer sb=new StringBuffer();
        for(int i=str1.length-1;i>=0;i--)
        {
            sb.append(str1[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
        System.out.println(Arrays.toString(str1));
    }
}
