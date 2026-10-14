package String;

import java.util.Arrays;

public class Compress2 {
    static void main(String[] args) {
//        char []chars = {'a','a','b','b','c','c','c'};
//        char []chars = {'a'};
        char[] chars = {
                'a', 'b', 'b', 'b', 'b', 'b',
                'b', 'b', 'b', 'b', 'b', 'b', 'b'
        };
        int i=0,count=0,write=0;
        char can='0';
        while(i<chars.length) {
            if(count==0)
            {
                chars[write]=chars[i];
                count++;
                write++;
                can=chars[i];

            }
            else if(can==chars[i])
            {
                count++;
                if(i==chars.length-1)
                {
                    if(count>1) {
                        String str = String.valueOf(count);
                        for (int k = 0; k < str.length(); k++) {
                            chars[write] = str.charAt(k);
                            write++;
                        }
                    }
                }
            }
            else if(can!=chars[i])
            {
                if(count>1) {
                    String str = String.valueOf(count);
                    for (int k = 0; k < str.length(); k++) {
                        chars[write] = str.charAt(k);
                        write++;
                    }
                }
                chars[write]=chars[i];
                write++;
                count=1;
                can=chars[i];
            }
            i++;
        }

        System.out.println(write);
        System.out.println(Arrays.toString(chars));
        int c=0;
        char m=(char)c;
        System.out.println(m);
        String sm=String.valueOf(16);
//        for(int n=0;n<sm.length();n++)
//        {
//            chars[n]=chars[write];
//            write++;
//        }
//        chars[write]=chars[i];
//        write++;
//        count=1;
//        can=chars[i];
//        System.out.println(sm.charAt(0));
    }
}


