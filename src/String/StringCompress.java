package String;

import java.util.Arrays;

public class StringCompress {
    static void main(String[] args) {
//        String s="aaaaaaaaaaaaaabb";
//        String s="abcde";
        String s="aaaaaaaaay";
        StringBuilder sb=new StringBuilder();
        int i=0,count=0;
        char ch=0;
        while(i<s.length())
        {
            if(count==0)
            {
                ch=s.charAt(i);
                count++;
            }
            else if(s.charAt(i)==ch)
            {
                 count++;
                 if(count==9)
                 {
                     sb.append(count);
                     sb.append(ch);
                     i++;
                     count=1;
                 }

            }
            else if(s.charAt(i)!=ch) {
                sb.append(count);
                sb.append(ch);
                ch = s.charAt(i);
                count = 1;

            }
            i++;

            }
//        sb.append(count);
//        sb.append(ch);
        System.out.println(s.length());
        System.out.println(Arrays.toString  (sb.toString().toCharArray()));
        }
    }

