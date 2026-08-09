package Array;

public class StringArrayDuplicate {
    public static void main(String[]args)
    {
        String []str={"john","amit","rohan","samarth","samarth","rohan","Amit"};
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                if(str[i].equalsIgnoreCase(str[j]))
                {
                    System.out.println(str[i]+" is duplicate");
                }
            }
        }
    }
}
