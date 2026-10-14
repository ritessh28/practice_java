package String;

import java.util.Arrays;

public class Compression {
    static void main(String[] args) {
        char []chars = {'a','a','b','b','c','c','c'};
//        char[] chars = {
//                'a', 'b', 'b', 'b', 'b', 'b',
//                'b', 'b', 'b', 'b', 'b', 'b', 'b'
//        };
//        char []chars = {'a'};
        StringBuilder sb=new StringBuilder();
        int i=0,count=0;
        char can='0';
        while(i<chars.length) {
            if(count==0)
            {
                sb.append(chars[i]);
                count++;
                can=chars[i];
            }
            else if(can==chars[i])
            {
                count++;
                if(i==chars.length-1)
                {
                    if(count>1) {
                        sb.append(count);
                    }
                }
            }
            else if(can!=chars[i])
            {
                if(count>1) {
                    sb.append(count);
                }
                sb.append(chars[i]);
                count=1;
                can=chars[i];
            }
            i++;
        }
        String s=new String(sb);
        System.out.println(sb.length());
        System.out.println(Arrays.toString(s.toCharArray()));

    }
}
