package String;

import java.util.Arrays;

public class StringClassReverse {
    public static void main(String[] args) {
        String str="A man, a plan, a canal, Panama";
        String str2="  the sky is blue  ";
        System.out.println(stringReverse(str2));

    }
    public static boolean stringReverse(String str)
    {

        String[] ch=str.toLowerCase().trim().split("\\s+");
//        System.out.println(Arrays.toString(ch));
//        String clean=String.join(" ",str);
//        System.out.println(clean);
//        System.out.println(Arrays.toString(ch));
        int i=0,j=ch.length-1;
        boolean ans=true;
        while(i<j)
        {
            if(ch[i]!=ch[j]) {
                ans = false;
                break;

            }

            i++;
            j--;
        }
        return ans;

    }
}