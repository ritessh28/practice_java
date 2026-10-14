package String;

import java.util.Arrays;

public class ReverseVowel {
    static boolean isVowel(char ch)
    {
        if (ch == 'a' || ch== 'A' || ch== 'e' || ch== 'E' || ch == 'i' ||
                ch == 'I' || ch == 'o' || ch== 'O' || ch== 'u' || ch== 'U') {
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        String s = "aefgu";
        System.out.println(s);
        char[] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        int i = 0, j = ch.length - 1;
        System.out.println(i + " " + j);
        while (i < j) {
            if(isVowel(ch[i])==false)
                i++;
            if(isVowel(ch[j])==false)
                j--;
            if(isVowel(ch[i])&&isVowel(ch[j]))
            {
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        String sh =new String(ch);

        System.out.println(sh);
    }
}
