package Array;

import java.util.Arrays;

public class Bubble2 {
    public static void main(String[] args) {
        int []arr={50,30,60,10,20};
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
