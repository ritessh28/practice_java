package String;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String str = "a good   example  ";
        String[] s1 = str.split("\\s+");
        int i = 0, j = s1.length - 1;
        while (i < j) {
            String temp = s1[i];
            s1[i] = s1[j];
            s1[j] = (temp);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(s1));
        String sr="";
        for(int k=0;k<=s1.length-1;k++)
        {
            sr=sr+s1[k];
            sr=sr+" ";
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(s1.length);
        for(int k=0;k<=s1.length-1;k++)
        {
            sb.append(s1[k]);
            sb.append(" ");
        }
        String sm=new String(sb);
        System.out.println(sb);
        System.out.println(sr);
    }
}
