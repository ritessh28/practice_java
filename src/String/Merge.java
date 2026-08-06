package String;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        String s1 = "abci";
        String s2 = "pqrst";
        StringBuilder sb = new StringBuilder("");
        int i = 0,k=0;
        int j = 0;
//        sb.insert(1,0);
//        sb.insert(2,78.5f);
//        System.out.println(Arrays.toString(sb));
        System.out.println(s1.length());
        while (i < s1.length() && j < s2.length()) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(j));
            i++;
            j++;
        }
        while(i<s1.length()) {
            sb.append(s1.charAt(i));
            i++;
        }
        while(j<s2.length()) {
            sb.append(s2.charAt(j));
            j++;
        }
        String result=sb.toString();
        System.out.println(result);


    }

}
