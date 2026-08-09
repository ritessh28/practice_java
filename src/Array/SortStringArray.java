package Array;

public class SortStringArray {
    public static void main(String[]args)
    {
        String []str={"java","python","angular","react"};
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str.length-1;j++)
            {
                if((str[j].compareTo(str[j+1]))>0)
                {
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        for(String s:str)
        {
            System.out.println(s);
        }
    }
}
