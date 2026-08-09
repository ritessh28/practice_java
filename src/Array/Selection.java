package Array;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
     int min;
     int temp;
     int []arr={50,30,60,10,20};
     for(int i=0;i<arr.length-1;i++)
     {
         min=i;
         for(int j=i+1;j<arr.length;j++)
         {
             if(arr[j]<arr[min])
                 min=j;
         }
         if(min!=i)
         {
             temp=arr[min];
             arr[min]=arr[i];
             arr[i]=temp;
         }
     }
        System.out.println(Arrays.toString(arr));
    }
}
