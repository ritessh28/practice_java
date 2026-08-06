package Array;

import java.util.Arrays;

public class StringSort {
    static void main(String[] args) {
        String[] str ={"java","Goa","goa","anand","zeta","Anand"};
//        System.out.println(str.toString());
//        int a=10;
//        System.out.println(Arrays.toString(str));
//        System.out.println(a);
//        System.out.println(str[0].toLowerCase());
        for(int i=0;i< str.length;i++)
        {
            for(int j=0;j< str.length-1;j++)
            {
                if(str[j].toLowerCase().compareTo(str[j+1].toLowerCase())>0)
                {

                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        for(int i=0;i< str.length;i++) {
            System.out.println(str[i]);
        }


    }
}
