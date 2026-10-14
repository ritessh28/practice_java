package Array;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[]args)
    {
        int []arr1={2,2,2,3};
        int size=arr1.length;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    for(int k=j;k<size-1;k++)
                    {
                        arr1[k]=arr1[k+1];
                    }
                    size--;
                }

            }
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println(Arrays.toString(arr1));

    }
}
