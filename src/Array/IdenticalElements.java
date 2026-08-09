package Array;

public class IdenticalElements {
    public static void main(String[]args)
    {
        String []str1={"rohan","amit","sohan","sumit"};
        String []str2={"rohit","mithal","sohan","shankar","sumit"};
        for(int i=0;i<str1.length;i++)
        {
            for(int j=0;j<str2.length;j++)
            {
                if(str1[i].equalsIgnoreCase(str2[j]))
                {
                    System.out.println(str1[i]+" is identical");
                }
            }

        }
    }
}
